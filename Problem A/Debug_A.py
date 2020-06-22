T=int(input("Enter number of test cases:"))
for j in range(T):
    n=int(input("Enter maximum ammount: "))
    sum=1
    count=1
    l=[1]
    for i in range(2,n+1):
        if(sum>=n): break
        if(i>sum):
            count+=1
            sum+=i
            l.append(i)
    print("The coins are:",l)
    print("Number of Denomination: ",count)
    print("=================Debug=====================")
    for x in range(1,n+1):  
        bkp=x
        p=0
        for i in range(len(l)):
            if(l[i]==x):
                p=1
                break
            if(l[i]>x):
                l2=l[:i]
                break
            if(i==(len(l)-1)): l2=l
        if(p==1):
            print("passed for: ",bkp)
            continue
        else:
            l2=l2[::-1]
            #print("for ",x,"list: ",l2)
            while(len(l2)>0):
                if(x==0):
                    p=1
                    break
                if(x in l2):
                    p=1
                    l2.remove(x)
                    break
                for y in l2:
                    if(y<x):
                        x-=y
                        l2.remove(y)
                        break
        if(p==1): print("passed for: ",bkp)
        else: print("failed for input: ",bkp)
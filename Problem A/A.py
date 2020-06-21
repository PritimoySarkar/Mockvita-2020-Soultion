T=int(input())
for j in range(T):
    n=int(input())
    sum=1
    count=1
    for i in range(2,n+1):
        if(sum>=n): break
        if(i>sum):
            count+=1
            sum+=i
    print(count)

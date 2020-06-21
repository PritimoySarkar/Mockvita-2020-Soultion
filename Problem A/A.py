T=int(input())
for i in range(T):
    n=int(input())
    sum=1
    count=1
    for i in range(2,n):
        if(sum>=n): break
        if(i>sum):
            count+=1
            sum+=i
    print(count)
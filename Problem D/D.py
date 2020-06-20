n=int(input())
r1,r2=map(int,input().split())
r=int(input())
l=[]
ds=[31,28,31,30,31,30,31,31,30,31,30,31]
for i in range(len(ds)):
    for j in range(ds[i]):
        pt=((6-i-1)**2)+abs(j+1-15)
        l.append(pt)

flag=0
for i in range(1,n+1):
    cost=0
    for j in l:
        if(j>=n): cost+=((i*r1)+(n-i)*r2)
        else:
            ntv=n-i
            if((j-ntv)<=0): cost+=j*r2
            else: cost+=(((j-ntv)*r1)+(ntv*r2))
    if(cost>=r):
        print(i)
        flag=1
        break
if(flag==0): print(n)
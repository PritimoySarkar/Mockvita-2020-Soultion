import math
from collections import Counter
c=int(input())
l=[]
for i in range(c):
    x,y,v=map(int,input().split())
    d=round(math.sqrt(x*2+y*2))
    t=d//v
    l.append(t)
col=Counter(l)
colide=0
for i in col:
    if(col[i]>1):
        colide+=((col[i])*((col[i])-1)//2)
print(colide)
import math
#Fucntion definatiom
def prc(low,high,n,xl,yl,xw,yw,f):
    for j in range(1,n+2):
        a,b=findx(low,high,round(.1**j,j),j,xl,yl,xw,yw,f)
        low=low+a
        high=low+b
    return low
def findx(low,high,deli,st,xl,yl,xw,yw,f):
    flag=0
    bp=-1
    for i in range(10):
        itr=round(i*deli,st)
        l=math.sqrt((yl**2)+((low+itr-xl)**2))
        w=math.sqrt((yw**2)+((xw-(low+itr))**2))
        t=(l/f)+w
        if(i!=0 and t>old):
            flag=1
            bp=i
            break
        old=t
    if(flag==0): return round(9*deli,st),round(10*deli,st)
    else: return round((bp-1)*deli,st),round(bp*deli,st)        
#main code
xl=int(input())
yl=int(input())
xw=int(input())
yw=int(input())
f=float(input())
yw=yw*(-1)
if(xw<xl):
    neg=1
    dif=xl-xw
    xw=xl+dif
else: neg=0
brp=-1
rg=xw-xl
flag=0
for i in range(rg+1):
    l=math.sqrt((yl**2)+((i)**2))
    w=math.sqrt((yw**2)+((xw-(i+xl))**2))
    t=(l/f)+w
    if(i!=0 and t>old):
        flag=1
        brp=i
        break
    old=t
if(flag==0):
    low=xl+brp-1
    high=low+1
else:
    low=xl+brp-1
    high=low+1
xo=prc(low,high,6,xl,yl,xw,yw,f)
x0=round(xo,6)
if(neg==1):
    dif=xo-xl
    xo=xl-dif
print("%.6f"%xo)
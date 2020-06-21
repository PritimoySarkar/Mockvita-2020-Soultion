import math
def pfact(a,b):
    f=1
    for i in range(a+1,b+1):
        f*=i
    return f
def modi(a, m) : 
    m0 = m 
    y = 0
    x = 1
    if (m == 1) : 
        return 0
    while (a > 1) : 
        q = a // m 
        t = m 
        m = a % m 
        a = t 
        t = y 
        y = x - q * y 
        x = t 
    if (x < 0) : 
        x = x + m0 
    return x

T=int(input())
for i in range(T):
    n,t,m=map(int,input().split())
    if(t>(n-m)): prob=1
    else:
        num=pfact((n-t-m),(n-t))
        dnum=pfact((n-m),n)
        d=math.gcd(num,dnum)
        num=num//d
        dnum=dnum//d
        md=modi(dnum,1000000007)
        print(num*md)
import math
def isp(n):
    if(n==2 or n==3):
        return True
    else:
        for i in range(2,int(math.sqrt(n))+1):
            if(n%i==0): return False
        return True

def fib(a,b,n): 
    if (n==0): 
        return a 
    elif (n ==1):
        return b 
    else: 
        for i in range(2,n): 
            c = a + b 
            a = b 
            b = c 
        return b

    
a,b=map(int,input().split())
l1=[]
for i in range(a,b+1):
    if(isp(i)): l1.append(i)

l2=[]
for i in l1:
    s1=str(i)
    for j in l1:
        if(i!=j):
            s2=str(j)
            x=int(s1+s2)
            if(x not in l2):
                l2.append(x)
l3=[]
for i in l2:
    if(isp(i)): l3.append(i)
mi=min(l3)
mx=max(l3)
n=len(l3)

last=fib(mi,mx,n)
print(last)
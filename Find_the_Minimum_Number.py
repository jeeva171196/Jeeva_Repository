import sys


n = int(input().strip())
if n>=2 and n<=50:
    s=')'
    s1='min(int, '
    if n==2:
        print('min(int, int)')
    else:
        for i in range(0,n-2):
            s1=s1+'min(int, '
            s=s+')'
        print(s1+'int'+s)

n=3
def solution(n,temp=0):
    while(n!=0):
        if(n%2==0):
            n=n/2
            temp+=1
        elif(n%5==0):
            n=n*(4/5)
            temp+=1
        else:
            n-=1
            temp+=1
    return temp
print(solution(n))

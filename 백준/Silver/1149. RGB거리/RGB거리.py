N = int(input())
a = [0] * N

for i in range(N):
    a[i] = list(map(int,input().split()))
    
for i in range(1,N): 
    a[i][0]= min(a[i-1][1],a[i-1][2]) + a[i][0]
    a[i][1]= min(a[i-1][0],a[i-1][2]) + a[i][1]
    a[i][2]= min(a[i-1][0],a[i-1][1]) + a[i][2]
#여기서 N-1이 되는 경우는, 맨 마지막 list의 세 가지 비용(?) 중 가장 큰 수. 
print(min(a[N-1][0],a[N-1][1],a[N-1][2]))
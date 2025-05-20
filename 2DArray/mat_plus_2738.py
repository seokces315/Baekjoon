# Input processing
N, M = list(map(int, input().split()))  # 1 <= N, M <= 100

# Define 2-dimensional array
mat_a = [[-1 for _ in range(M)] for _ in range(N)]
mat_b = [[-1 for _ in range(M)] for _ in range(N)]
res = [[-1 for _ in range(M)] for _ in range(N)]

# Insert values into defined array
# Mat_a
for i in range(N):
    row = list(map(int, input().split()))
    # Branching
    for j in range(M):
        mat_a[i][j] = row[j]

# Mat_b
for i in range(N):
    row = list(map(int, input().split()))
    # Branching
    for j in range(M):
        mat_b[i][j] = row[j]

# Addition
for i in range(N):
    for j in range(M):
        res[i][j] = mat_a[i][j] + mat_b[i][j]

# Print output
for i in range(N):
    for j in range(M):
        print(res[i][j], end=" ")
    print()

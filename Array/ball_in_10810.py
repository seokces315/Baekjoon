# Input processing
N, M = list(map(int, input().split()))  # 1 <= N, M <= 100
basket = [0] * N

# Loop : Ball-in
for _ in range(M):
    i, j, k = list(map(int, input().split()))  # 1 <= i <= j <= N, 1 <= k <= M
    for l in range(i - 1, j):
        basket[l] = k

# Print output
for ball in basket:
    print(ball, end=" ")

# Input processing
N, M = list(map(int, input().split()))  # 1 <= N, M <= 100
basket = [i for i in range(1, N + 1)]

# Ball changing
for _ in range(M):
    i, j = list(map(int, input().split()))  # 1 <= i, j <= N

    # Change mechanism
    tmp = basket[i - 1]
    basket[i - 1] = basket[j - 1]
    basket[j - 1] = tmp

# Print output
for ball in basket:
    print(ball, end=" ")

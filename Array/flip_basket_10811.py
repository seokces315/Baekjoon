# Input processing
N, M = list(map(int, input().split()))  # 1 <= N, M <= 100
basket = [i for i in range(1, N + 1)]

# Basket flipping
for _ in range(M):
    i, j = list(map(int, input().split()))  # 1 <= i <= j <= N

    # Flipping mechanism or .reverse()
    n_trial = (j - (i - 1)) // 2
    for l in range(n_trial):
        tmp = basket[i - 1 + l]
        basket[i - 1 + l] = basket[j - 1 - l]
        basket[j - 1 - l] = tmp

# Print output
for ball in basket:
    print(ball, end=" ")

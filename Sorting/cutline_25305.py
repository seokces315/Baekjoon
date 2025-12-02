# Input processing
N, k = list(map(int, input().split()))  # 1 <= N <= 1000 1 <= k <= N
score_list = list(map(int, input().split()))

# Sorting the list
score_list.sort(reverse=True)

# Print output
cutline = score_list[k - 1]
print(cutline)

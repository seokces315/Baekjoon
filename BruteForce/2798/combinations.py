from itertools import combinations

# Input processing
N, M = list(map(int, input().split()))  # 3 <= N <= 100, 10 <= M <= 300000
card_list = list(map(int, input().split()))  # 1 <= Card <= 100000

# Find combinations of given card list
card_pairs = list(combinations(card_list, 3))

# Lambda -> Summation & Sorting
candidate_list = list(map(lambda x: sum(x), card_pairs))

# Delete duplicated data
candidate_list = list(set(candidate_list))
candidate_list.sort()

# Find the closest number
filtered_list = [candidate for candidate in candidate_list if candidate <= M]
# Print output
print(filtered_list[-1])

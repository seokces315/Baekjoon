from collections import Counter

# Input processing
result = list(map(int, input().split()))

# Generate Counter & Branching factor
counter = Counter(result)
branching_factor = len(set(result))

# Calculate rewards
if branching_factor == 1:
    reward = 10000 + result[0] * 1000
elif branching_factor == 2:
    for k, v in counter.items():
        if v == 2:
            reward = 1000 + k * 100
else:
    reward = max(result) * 100

# Print output
print(reward)

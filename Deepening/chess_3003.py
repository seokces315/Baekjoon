# Input processing
piece_list = list(map(int, input().split()))  # 0 ~ 10

# Define goal list
goal_list = [1, 1, 2, 2, 2, 8]

# Calculate scarce pieces
target_list = [goal_list[i] - piece_list[i] for i in range(len(goal_list))]

# Print output
for target in target_list:
    print(target, end=" ")

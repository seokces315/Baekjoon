# Input processing
N = int(input())
starting_point_list = []
for _ in range(N):
    starting_point = list(map(int, input().split()))
    starting_point_list.append(starting_point)

# Define total space with matrix
bg_length = 100
total_space = [[0 for _ in range(bg_length)] for _ in range(bg_length)]

# Filling confetti
confetti_length = 10
for starting_point in starting_point_list:
    for i in range(confetti_length):
        for j in range(confetti_length):
            total_space[starting_point[0] + i][starting_point[1] + j] = 1

# Print output
total_sum = []
for i in range(bg_length):
    total_sum.append(sum(total_space[i]))
print(sum(total_sum))

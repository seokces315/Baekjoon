# Input processing
N = int(input())  # 1 <= N <= 100
integer_list = list(map(int, input().split()))  # -100 ~ 100
v = int(input())  # Target

# Filtering or .count()
filtered_list = [integer for integer in integer_list if integer == v]

# Print output
print(len(filtered_list))

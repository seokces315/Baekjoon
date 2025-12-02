import sys

input = sys.stdin.readline

# Input processing
num_list = list()
N = int(input())  # 1 <= N <= 1000000
for _ in range(N):
    num_list.append(int(input()))

# Sorting numbers in the list
num_list.sort()

# Print output
for num in num_list:
    print(num)

import sys

input = sys.stdin.readline

# Input processing
N = int(input())  # 1 <= N <= 10000000
num_list = list()
for _ in range(N):
    num_list.append(int(input()))

# Sorting numbers in the list
num_list.sort()

# Print output
for num in num_list:
    print(num)

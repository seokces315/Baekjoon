# Input processing
num_list = list()
N = int(input())
for i in range(N):
    num = int(input())
    num_list.append(num)

# Sorting numbers in the list
num_list.sort()

# Print output
for num in num_list:
    print(num)

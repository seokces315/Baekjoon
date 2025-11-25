# Input processing
num_list = list()
T = 5
for i in range(5):
    num = int(input())
    num_list.append(num)
    
# Sorting the list
num_list.sort()

# 1. Mean
cnt = len(num_list)
total = 0
for num in num_list:
    total += num
mean = total / cnt

# 2. Median

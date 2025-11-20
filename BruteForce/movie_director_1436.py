# Input processing
N = int(input())  # 1 <= N <= 10,000

# Solution loop
cnt = 0
cur_num = 665
while cnt < N:  # Exit condition
    # Move to the next number
    cur_num += 1

    # Check if the number contains the substring "666"
    if "666" in str(cur_num):
        cnt += 1

print(cur_num)

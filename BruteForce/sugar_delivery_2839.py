# Input processing
N = int(input())  # 3 <= N <= 5000

# Solution loop
bag_cnt = 0
while N >= 0:
    # Check if the remaining sugar is divisible by 5
    if N % 5 == 0:
        bag_cnt += N // 5
        print(bag_cnt)
        break

    # Filling the 3kg bag with sugar
    N -= 3
    bag_cnt += 1
else:
    print(-1)

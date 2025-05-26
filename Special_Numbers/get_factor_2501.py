# Input processing
N, K = list(map(int, input().split()))  # 1 <= N <= 10000, 1 <= K <= N

# Find the kst factor
break_flag = False
factor_counter = 0
for i in range(1, N + 1):
    if N % i == 0:
        factor_counter += 1

    # Break condition
    if factor_counter == K:
        print(i)
        break_flag = True
        break

# If, break condition doesn't work
if break_flag is False:
    print(0)

# Input processing
N, B = list(map(int, input().split()))  # 2 <= B <= 36

# Define base dictionary
digit_10 = "0123456789"
alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
whole_list = [digit_10, alphabet]
whole_str = "".join(whole_list)
whole_dict = dict()
for i in range(len(whole_str)):
    whole_dict[i] = whole_str[i]

# Base conversion algorithm
remain_list = []
while True:
    # Break condition
    if N < B:
        remain_list.append(N)
        break

    # Remain processing
    remain = N % B
    remain_list.append(remain)

    # New N
    N //= B

# Print output
for i in range(len(remain_list)):
    remain_list[i] = whole_dict[remain_list[i]]
result = "".join(remain_list)
result = result[::-1]
print(result)

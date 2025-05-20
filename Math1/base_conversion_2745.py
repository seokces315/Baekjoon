# Input processing
N, B = list(map(str, input().split()))  # 2 <= B <= 36

# Define base dictionary
digit_10 = "0123456789"
alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
whole_dict = dict()
for i in range(len(digit_10)):
    whole_dict[digit_10[i]] = i
for i in range(len(alphabet)):
    whole_dict[alphabet[i]] = 10 + i

# Calculating result
result = 0
for i in range(len(N)):
    new_N = whole_dict[N[-1 - i]]
    result += new_N * (int(B) ** i)

# Print output
print(result)

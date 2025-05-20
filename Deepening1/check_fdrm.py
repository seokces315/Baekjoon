# Input processing
String = input()  # 1 <= length <= 100

# Checking algorithm
length = len(String)
checking_range = length // 2
flag = 1
for i in range(checking_range):
    if String[i] != String[length - 1 - i]:
        flag = 0
        break

# Print output
print(flag)

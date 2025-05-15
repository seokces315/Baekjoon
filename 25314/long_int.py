# Input processing
N = int(input())  # 4 <= N <= 1000, 4의 배수

# Define type list
type_list = []
epoch = N // 4
for i in range(epoch):
    type_list.append("long")
type_list.append("int")

# Print output
print(" ".join(type_list))

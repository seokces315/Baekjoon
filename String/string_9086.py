# Input processing
T = int(input())  # 1 <= T <= 10

# Concatenate the given string elements
output_list = []
for _ in range(T):
    String = input()  # Max-length : 1000
    output = "{}{}".format(String[0], String[-1])
    output_list.append(output)

# Print output
for output in output_list:
    print(output)

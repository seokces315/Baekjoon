from itertools import permutations


# Operator functions
def div(oad1, oad2):
    flag = False
    if oad1 < 0 and oad2 >= 0:
        oad1 = -oad1
        flag = True
    elif oad1 >= 0 and oad2 < 0:
        oad2 = -oad2
        flag = True
    elif oad1 < 0 and oad2 < 0:
        oad1 = -oad1
        oad2 = -oad2

    if flag is True:
        return (oad1 // oad2) * (-1)
    else:
        return oad1 // oad2


# Input processing
N = int(input())  # 2 <= N <= 11
seq = list(map(int, input().split()))  # 1 <= A <= 100
op_values = list(map(int, input().split()))  # Max : N - 1

# Define operators
ops = ["+", "-", "*", "//"]
# Define given op_values' multi-set
op_list = []
for i in range(len(op_values)):
    for _ in range(op_values[i]):
        op_list.append(ops[i])

# Generate operator sequence
op_seqs = permutations(op_list, N - 1)
set_op_seqs = set(op_seqs)

# Solution loop
maximum = int(-1e9)
minimum = int(1e9)
for op_seq in set_op_seqs:
    res = seq[0]

    # Update results
    for i in range(len(op_seq)):
        if op_seq[i] == "+":
            res += seq[i + 1]
        elif op_seq[i] == "-":
            res -= seq[i + 1]
        elif op_seq[i] == "*":
            res *= seq[i + 1]
        else:
            res = div(res, seq[i + 1])

    if res > maximum:
        maximum = res
    if res < minimum:
        minimum = res

# Print output
print(maximum)
print(minimum)

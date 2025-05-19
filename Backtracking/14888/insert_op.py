from itertools import permutations


# Operator functions
def plus(oad1, oad2):
    return oad1 + oad2


def minus(oad1, oad2):
    return oad1 - oad2


def mul(oad1, oad2):
    return oad1 * oad2


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


# Branch function
def operate(op, oad1, oad2):
    if op == 0:
        res = plus(oad1, oad2)
    elif op == 1:
        res = minus(oad1, oad2)
    elif op == 2:
        res = mul(oad1, oad2)
    else:
        res = div(oad1, oad2)
    return res


# Input processing
N = int(input())  # 2 <= N <= 11
seq = list(map(int, input().split()))  # 1 <= A <= 100
op_values = list(map(int, input().split()))  # Max : 10

# Define operator count dict & space
op_keys = ["+", "-", "*", "//"]
op_cnt_dict = dict(zip(op_keys, op_values))
space = []

# Fill space
for i in range(len(op_keys)):
    op_cnt = op_cnt_dict[op_keys[i]]
    for _ in range(op_cnt):
        space.append(i)

# Generate operator sequence
op_sequences = list(permutations(list(space), N - 1))
set_op_sequences = list(set(op_sequences))

# Brute-force
max_value = -1000000000
min_value = 1000000000
for op_seq in set_op_sequences:
    res = seq[0]
    # Update results
    for i in range(len(op_seq)):
        res = operate(op_seq[i], res, seq[i + 1])

    # If the condition is met, change the max/min value
    if res > max_value:
        max_value = res
    if res < min_value:
        min_value = res

# Print output
print(max_value)
print(min_value)

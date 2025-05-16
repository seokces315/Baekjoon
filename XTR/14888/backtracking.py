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
N = int(input())
seq = list(map(int, input().split()))
op_values = list(map(int, input().split()))

# Define global variables
maximum = int(-1e9)
minimum = int(1e9)


# Backtracking - DFS
def dfs(depth, result, plus, minus, multiply, divide):
    # Global vars
    global maximum, minimum
    if depth == N:
        maximum = max(result, maximum)
        minimum = min(result, minimum)
        return

    # Recursive call
    if plus:
        dfs(depth + 1, result + seq[depth], plus - 1, minus, multiply, divide)
    if minus:
        dfs(depth + 1, result - seq[depth], plus, minus - 1, multiply, divide)
    if multiply:
        dfs(depth + 1, result * seq[depth], plus, minus, multiply - 1, divide)
    if divide:
        result = div(result, seq[depth])
        dfs(depth + 1, result, plus, minus, multiply, divide - 1)


# Start searching
depth = 1
result = seq[0]
dfs(depth, result, op_values[0], op_values[1], op_values[2], op_values[3])

# Print output
print(maximum)
print(minimum)

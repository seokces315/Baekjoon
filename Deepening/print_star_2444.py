# Input processing
N = int(input())  # 1 <= N <= 100

# Print star algorithm
for i in range(N - 1):
    for j in range(N + i):
        if j < N - (i + 1):
            print(" ", end="")
        else:
            print("*", end="")
    print()
for i in range(2 * N - 1):
    print("*", end="")
print()
for i in range(N - 1):
    for j in range(2 * N - 1 - i):
        if i < j and j < 2 * N - 1 - (i + 1):
            print("*", end="")
        else:
            print(" ", end="")
    print()

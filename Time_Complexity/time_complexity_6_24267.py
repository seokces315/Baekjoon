# Given function
def MenOfPassion(A, n):
    total = 0

    for i in range(1, n - 2):
        for j in range(i + 1, n - 1):
            for k in range(j + 1, n):
                total = total + A[i] * A[j] * A[k]

    return total


# Input processing
n = int(input())

# Print output
print()
print(3)
# Given function
def MenOfPassion(A, n):
    total = 0

    for i in range(1, n - 1):
        for j in range(i + 1, n):
            total = total + A[i] * A[j]

    return total


# Input processing
n = int(input())

# Print output
print(int(0.5 * (n**2 - n)))
print(2)

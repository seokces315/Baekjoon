# Given function
def MenOfPassion(A, n):
    total = 0

    for i in range(1, n):
        for j in range(1, n):
            total = total + A[i] * A[j]

    return total


# Input processing
n = int(input())

# Print output
print(n**2)
print(2)

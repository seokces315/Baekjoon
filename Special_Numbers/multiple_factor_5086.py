# Input processing
while True:
    a, b = list(map(int, input().split()))

    # Break condition
    if a == 0 and b == 0:
        break

    # Discrimination algorithm
    res = "multiple" if a % b == 0 else "factor" if b % a == 0 else "neither"

    # Print output
    print(res)

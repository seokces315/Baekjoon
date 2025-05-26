# Input processing
while True:
    n = int(input())

    # Break condition
    if n == -1:
        break

    # Discrimination algorithm
    factor_list = []
    for i in range(1, n):
        if n % i == 0:
            factor_list.append(i)

    if sum(factor_list) == n:
        print(f"{n} = {factor_list[0]}", end="")
        for j in range(1, len(factor_list)):
            print(f" + {factor_list[j]}", end="")
        print()
    else:
        print(f"{n} is NOT perfect.")

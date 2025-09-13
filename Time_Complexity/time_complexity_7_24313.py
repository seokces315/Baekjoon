# Input processing
a_1, a_0 = list(map(int, input().split()))
c = int(input())
n_0 = int(input())


# Given function
def f(n):
    return a_1 * n + a_0


def g(n):
    return n


result = 1 if (f(n_0) <= c * g(n_0)) and (a_1 <= c) else 0

print(result)

# Input processing
X = int(input())  # 1 <= X <= 1000000000
N = int(input())  # 1 <= N <= 100

# Calculate total price
total_price = 0
for i in range(N):
    a, b = list(map(int, input().split()))  # 1 <= a <= 1000000, 1 <= b <= 10
    total_price += a * b

# Print output
result = "Yes" if total_price == X else "No"
print(result)

# Input processing
A, B = list(map(int, input().split()))  # 0 <= A <= 23, 0 <= B <= 59
C = int(input())  # 0 <= C <= 1000

# Transform cooking time(min) into cooking time(H)
cooking_hour = C // 60
remain_min = C % 60

# Branching
add_flag = 0
if B + remain_min >= 60:
    add_flag = 1
    B = (B + remain_min) % 60
else:
    B = B + remain_min
if A + cooking_hour + add_flag >= 24:
    A = (A + cooking_hour + add_flag) % 24
else:
    A = A + cooking_hour + add_flag

# Print output
print(A, B)

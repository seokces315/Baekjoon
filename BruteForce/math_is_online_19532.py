# Input processing
coef_list = list(map(int, input().split()))

# Solution loop
sol_x = 0
sol_y = 0
for x in range(-999, 1000):
    for y in range(-999, 1000):
        # Condition 1.
        cond1 = True if coef_list[0] * x + coef_list[1] * y == coef_list[2] else False
        if cond1 is False:
            continue
        # Condition 2.
        cond2 = True if coef_list[3] * x + coef_list[4] * y == coef_list[5] else False
        if cond2 is True:
            sol_x = x
            sol_y = y
            break

# Print output
print(sol_x, sol_y)

# Input processing
N = input()  # 1 <= N <+ 1000000

# Generator flag
gen_flag = False

# Solution loop
n_digits = len(N)
lower_bound = max(0, int(N) - n_digits * 9)
for generator in range(lower_bound, int(N)):
    gen_result = generator
    gen = str(generator)
    for g in gen:
        gen_result += int(g)

    if gen_result == int(N):
        gen_flag = True
        break

# Print output
if gen_flag is False:
    print(0)
else:
    print(generator)

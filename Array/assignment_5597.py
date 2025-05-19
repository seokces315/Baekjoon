# Input processing
submit_list = []
demand_submit = 30
n_submit = 28
for _ in range(n_submit):
    n = int(input())
    submit_list.append(n)

# Find missing numbers
target_list = []
for i in range(demand_submit):
    try:
        res = submit_list.index(i + 1)
    except:
        target_list.append(i + 1)

# Print output
for target in target_list:
    print(target)

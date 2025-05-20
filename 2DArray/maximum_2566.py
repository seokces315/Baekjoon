# Input processing
n_rows = 9
matrix = []
for _ in range(n_rows):
    row = list(map(int, input().split()))
    matrix.append(row)

# Algorithm that finds the maximum
candidate_val_list = []
candidate_idx_list = []
for i in range(n_rows):
    # Value
    candidate = max(matrix[i])
    candidate_val_list.append(candidate)
    # Index
    idx = matrix[i].index(candidate)
    candidate_idx_list.append(idx)

# Print output
maximum = max(candidate_val_list)
row_idx = candidate_val_list.index(maximum)
col_idx = candidate_idx_list[row_idx]

print(maximum)
print(row_idx + 1, col_idx + 1)

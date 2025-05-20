# Input processing
n_line = 5
matrix = []
row_length_list = []
for _ in range(n_line):
    row = list(map(lambda x: x, input()))
    matrix.append(row)
    row_length_list.append(len(row))

# Read vertically
max_row_length = max(row_length_list)
for i in range(max_row_length):
    for j in range(n_line):
        try:
            print(matrix[j][i], end="")
        except IndexError:
            pass

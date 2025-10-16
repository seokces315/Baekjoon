# Input processing
N, M = list(map(int, input().split()))  # 8 <= N, M <= 50

# Store current chessboard's state
chessboard = [[0] * M for _ in range(N)]
for i in range(N):
    row = input()
    for j in range(M):
        chessboard[i][j] = row[j]

# Define starting point list
start_point_list = list()
for i in range(N - 8 + 1):
    for j in range(M - 8 + 1):
        start_point_list.append((i, j))

# Count the number of squares that need to be repainted
count_list = list()
start_color_list = ["B", "W"]
for idx in range(len(start_point_list)):
    x, y = start_point_list[idx][0], start_point_list[idx][1]

    for start_color in start_color_list:

        counter = 0
        for i in range(x, x + 8):
            for j in range(y, y + 8):
                if ((x + y) % 2) == ((i + j) % 2):
                    if start_color != chessboard[i][j]:
                        counter += 1
                else:
                    if start_color == chessboard[i][j]:
                        counter += 1

        count_list.append(counter)

# Find the smallest value in the count list
minimum = min(count_list)

# Print output
print(minimum)

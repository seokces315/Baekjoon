# Input processing
N = int(input())

# Append points into defined list
points_x = []
points_y = []
for _ in range(N):
    x, y = list(map(int, input().split()))
    points_x.append(x)
    points_y.append(y)

# Print output
if len(points_x) == 1:
    print(0)
else:
    area = (max(points_x) - min(points_x)) * (max(points_y) - min(points_y))
    print(area)

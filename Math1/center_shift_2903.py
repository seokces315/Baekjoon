# Function to calculate total number of points
def calculate_n_points(N):
    return 2 * N + 1 if N == 1 else 2 * calculate_n_points(N - 1) - 1


# Input processing
N = int(input())  # 1 <= N <= 15

# Calculating total number of points
points_in_line = calculate_n_points(N)

# Print output
total_n_points = points_in_line * points_in_line
print(total_n_points)

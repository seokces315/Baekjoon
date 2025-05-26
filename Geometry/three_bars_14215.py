# Input processing
side_list = list(map(int, input().split()))

# Special case : Can't make triangle
max_side = max(side_list)
other_side_sum = sum(side_list) - max_side
max_side = (other_side_sum - 1) if max_side >= other_side_sum else max_side

# Print output
print(max_side + other_side_sum)

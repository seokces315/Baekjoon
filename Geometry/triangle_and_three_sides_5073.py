# Input processing
while True:
    side_list = list(map(int, input().split()))

    # Break condition
    if side_list[0] == 0 and len(set(side_list)) == 1:
        break

    # Check if given sides satisfy triangle
    max_side = max(side_list)
    if max_side >= (sum(side_list) - max_side):
        print("Invalid")
    elif len(set(side_list)) == 1:
        print("Equilateral")
    elif len(set(side_list)) == 2:
        print("Isosceles")
    else:
        print("Scalene")

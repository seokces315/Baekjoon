# Input processing
angle_list = []
for _ in range(3):
    angle = int(input())
    angle_list.append(angle)

# Branching & Print output
if sum(angle_list) != 180:
    print("Error")
elif len(set(angle_list)) == 1:
    print("Equilateral")
elif len(set(angle_list)) == 2:
    print("Isosceles")
else:
    print("Scalene")

# Function to map rating
def map_rating(rating):
    if rating == "A+":
        res = 4.5
    elif rating == "A0":
        res = 4.0
    elif rating == "B+":
        res = 3.5
    elif rating == "B0":
        res = 3.0
    elif rating == "C+":
        res = 2.5
    elif rating == "C0":
        res = 2.0
    elif rating == "D+":
        res = 1.5
    elif rating == "D0":
        res = 1.0
    elif rating == "F":
        res = 0.0
    else:
        res = -1

    return res


# Input processing & Calculate results
n_subjects = 20
total_credit = 0.0
total_rating = 0.0
for _ in range(n_subjects):
    _, credit, rating = list(map(lambda x: x, input().split()))

    # Exception -> rating == "P"
    credit = float(credit)
    rating = map_rating(rating)
    if rating != -1:
        total_credit += credit
        total_rating += credit * rating

# Print output
your_gpa = total_rating / total_credit
print(your_gpa)

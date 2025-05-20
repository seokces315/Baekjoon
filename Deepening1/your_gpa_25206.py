# Function to map rating
def map_rating(rating):
    rating_map = {
        "A+": 4.5,
        "A0": 4.0,
        "B+": 3.5,
        "B0": 3.0,
        "C+": 2.5,
        "C0": 2.0,
        "D+": 1.5,
        "D0": 1.0,
        "F": 0.0,
        "P": -1,
    }
    return rating_map.get(rating)


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

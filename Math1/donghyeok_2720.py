# Input processing
T = int(input())

# Local vars
quarter = 25
dime = 10
nickel = 5
penny = 1

# Change algorithm
for _ in range(T):
    change = int(input())

    # Quarter
    n_quarters = change // quarter
    change %= quarter

    # Dime
    n_dimes = change // dime
    change %= dime

    # Nickel
    n_nickels = change // nickel
    change %= nickel

    # Penny
    n_pennies = change

    # Print output
    print(n_quarters, n_dimes, n_nickels, n_pennies)

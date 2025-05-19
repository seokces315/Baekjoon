# Loop : Just Print
while True:
    # Try~except for EOF
    try:
        String = input()
        print(String)
    except EOFError:
        break

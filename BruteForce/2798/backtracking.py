# Input processing
N, M = list(map(int, input().split()))  # 3 <= N <= 100, 10 <= M <= 300000
card_list = list(map(int, input().split()))  # 1 <= Card <= 100000

# Solution loop
card_list_length = len(card_list)
total_sum_list = [-1]
for i in range(card_list_length):
    first_card = card_list[i]
    for j in range(i + 1, card_list_length):
        second_card = card_list[j]
        for k in range(j + 1, card_list_length):
            third_card = card_list[k]

            # Branching : Append or Not
            total_sum = first_card + second_card + third_card
            if total_sum > M:
                continue

            total_sum_list.append(total_sum)

# Print output
result = max(total_sum_list)
print(result)

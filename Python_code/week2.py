N,W = list(map(int, input().split()))
numbers = list(map(int, input().split()))

numbers.sort()

stones = 0

while stones < N and numbers[stones] <= W:
    W -= numbers[stones]
    stones += 1

print(stones)

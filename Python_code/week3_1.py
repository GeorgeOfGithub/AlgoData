N = int(input())


Nlist = list(map(int, input().split()))

def maxSubArraySum(arr,size):
    
    max_till_now = arr[0]
    max_ending = 0
    
    for i in range(0, size):
        max_ending = max_ending + arr[i]
        if max_ending < 0:
            max_ending = 0
        
        
        elif (max_till_now < max_ending):
            max_till_now = max_ending
    if all(n < 0 for n in arr):
        return max(arr)
    else:        
        return max_till_now

print(maxSubArraySum(Nlist,len(Nlist)))


# Solution
# n = int(input())
# numbers = list(map(int, input().split()))

# best = numbers[0]

# for i in range(n):
# 	sum = 0
# 	for j in range(i, n):
# 		sum += numbers[j]
# 		if sum > best:
# 			best = sum

# print(best)
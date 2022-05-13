n = int(input())
numbers = list(map(int, input().split()))

def peakpoint(arr, size):
    if arr[0] > arr[1]:
        return 0

    for i in range(1,size-1):
        if arr[i]>=arr[i-1] and arr[i]>=arr[i+1]:
            return i

    if arr[size-1]>arr[size-2]:
        return size-1

    return 0

print(peakpoint(numbers,n))


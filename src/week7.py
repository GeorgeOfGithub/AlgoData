class Heap:

    def __init__(self, n):
        self.heap = [(0,0)] * (n+1)
        self.len = 0

    def swap(self, i, j):
        temp = self.heap[i]
        self.heap[i] = self.heap[j]
        self.heap[j] = temp
    
    def bubble_up(self, i):
        if i < 2: return
        parent = i // 2
        if self.heap[parent] < self.heap[i]:
            self.swap(i,parent)
            self.bubble_up(parent)

    def bubble_down(self, i):
        if i * 2 > self.len: return
        child = 2 * i + 1 if 2 * i + 1 <= self.len and self.heap[2*i+1] > self.heap[2*i] else 2*i
        if self.heap[child] > self.heap[i]:
            self.swap(child, i)
            self.bubble_down
    
    def insert(self, v):
        self.len += 1
        self.heap[self.len] = v
        self.bubble_up(self.len)

    def extract_max(self):
        res = self.heap[1]
        self.heap[1] = self.heap[self.len]
        self.len -= 1
        self.bubble_down(1)
        return res

    def __str__(self):
       " ".join(list(map(str,self.heap[1:self.len+1])))


n = int(input())

h = Heap(n)

# if loop variable is not used then just use _ instead of a chosen int or whatever
for _ in range(n):
    inp = input().split()
    if inp[0] == "N":
        h.insert((int(inp[2]),int(inp[1])))
    else:
        print(h.extract_max()[1])





class MaxHeap:

    def __init__(self,size) -> None:
        self.h = [0 for _ in range(size + 1)]
        self.id = [0 for _ in range(size +1)]
        self.size = 0


    def swap(self,i,j):
        self.h[i], self.h[j] = self.h[j], self.h[i]
        self.id[i], self.id[j] = self.id[j], self.id[i]

    def bubble_up(self, i):
        parent = i // 2
        if parent < 1:
            return
        if self.h[parent] < self.h[i]:
            self.swap(i,parent)
            self.bubble_up(parent)

    def bubble_down(self, i):
        if i * 2 > self.size:
            return
        child = i * 2 + 1 if i * 2 + 1 <= self.size and self.h[i * 2 + 1] > self.h[i * 2] else i * 2

        if self.h[child] > self.h[i]:
            self.swap(child,i)
            self.bubble_down(child)


    def insert(self, key, id):
        self.size += 1
        self.h[self.size] = key
        self.id[self.size] = id
        self.bubble_up(self.size)

    def extract_max(self):
        res = self.id[1]
        self.h[1] = self.h[self.size]
        self.id[1] = self.id[self.size]
        self.size -= 1
        self.bubble_down(1)
        return res



N = int(input())
h = MaxHeap(N)

for _ in range(N):
    inp = input().split()

    if inp[0] == "N":
        h.insert(int(inp[2]),int(inp[1]))
    else:
        print(h.extract_max())


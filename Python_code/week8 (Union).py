class Union:
    def __init__(self,size) -> None:
        self.u = [i for i in range(size)]
        self.size = [1 for _ in range(size)]


    def find(self,i):
        if self.u[i] == i:
            return i
        self.u[i] = self.find(self.u[i])
        return self.u[i]

    def union(self,i,j):
        ri = self.find(i)
        rj = self.find(j)
        if self.size[rj] > self.size[ri]:
            ri, rj = rj ,ri
        self.u[rj] = ri
        self.size[ri] += self.size[rj]

    def is_connected(self,i,j):
        return self.find(i) == self.find(j)

N, M = [int(i) for i in input().split()]


u = Union(N)

for _ in range(M):
    inp = input().split()
    if inp[0] == "A":
        u.union(int(inp[1]),int(inp[2]))
    else:
        print("YES" if u.is_connected(int(inp[1]),int(inp[2])) else "NO")

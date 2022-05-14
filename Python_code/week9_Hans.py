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


u = Union(N+1)

sum = 0
edges = []

for _ in range(M):
    bj,bi,price = [int(i) for i in input().split()]
    edges.append((price,bj,bi))


edges.sort()

added = 0
i = 0

for edge in edges:
    price,bj,bi = edge
    if not u.is_connected(bi,bj):
        added += 1
        sum += price
        u.union(bj,bi)
        if added == N -1:
            break

print(sum)



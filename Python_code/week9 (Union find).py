from heapq import heappop, heappush


class UnionFind:
    def __init__(self, n):
        self.p = list(range(n))
        self.s = [1]*n
    
    def find(self, i):
        if self.p[i] != i: self.p[i] = self.find(self.p[i])
        return self.p[i]
    
    def union(self, i, j):
        r_small, r_great = self.find(i), self.find(j)
        if self.s[r_small] > self.s[r_great]:
            r_small, r_great = r_great, r_small
        if r_small != r_great:
            self.s[r_great] += self.s[r_small]
            self.p[r_small] = r_great

# henter input
N, M = map(int, input().split())

sets = UnionFind(N+1)

edges = [tuple(map(int, input().split())) for i in range(M)]
edges.sort(key = lambda element: element[2])

total_price = 0

for bi, bj, price in edges:
    if sets.find(bi) != sets.find(bj):
        sets.union(bi,bj)
        total_price += price


# N, M = map(int, input().split())
# adj = [[].copy() for _ in range(N+1)]

# marked = [False]*(N+1)

# for i in range(M):
#     bi, bj, price = map(int, input().split())
#     adj[bi].append((price,bj))
#     adj[bj].append((price,bi))

# heap =[(0,1)]

# n_marked = 0

# total_price = 0

# while n_marked < N:
#     price, node = heappop(heap)
#     if not marked[node]:
#         total_price += price
#         marked[node] = True
#         n_marked += 1
#         for p, n in adj[node]:
#             heappush(heap,(p,n))

print(total_price)

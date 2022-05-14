
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




N = int(input())
M = int(input())
R = int(input())

u = Union(N*M+2)
removed = [False for _ in range(M*N)]


start = N*M
end = N*M + 1

path_exists = False
path_i = 0

for i in range(R):
    x,y = [int(k) for k in input().split()]

    index = y * N + x
    removed[index] = True

    if path_exists:
        continue


    if y==0:
        u.union(index,start)
    if y == M -1:
        u.union(index,end)

    if x > 0:
        if removed[index - 1]:
            u.union(index-1,index)
    if x < N - 1:
        if removed[index +1]:
            u.union(index + 1, index)

    if y > 0:
        if removed[index - N]:
            u.union(index-N,index)
    if y < M - 1:
        if removed[index + N]:
            u.union(index+N, index)

    if u.is_connected(start,end):
        path_exists = True
        path_i = i+1

print(path_i)


def Insert(adjacency, v, u):
    adjacency[v][u] = 1

def Adjacent(adjacency, v, u):
    return adjacency[v][u] == 1

def Neighbors(adjacency, v):
    return adjacency[v]

N = 5

adjacency = [[0]*N for i in range(N)]

Insert(adjacency,1,2)

print(Adjacent(adjacency,1,2))

print(Neighbors(adjacency,1))



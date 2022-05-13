from collections import deque

N = int(input())

size = N*N

adjacency = [[] for _ in range(size)]
distance = [0 for _ in range(size)]
visited = [False for _ in range(size)]
maze = ""


# Dette laver en adjacency liste
for i in range(N):
    inp = input()
    maze += inp
    for j in range(N):
        index = i * N + j
        if i > 0:
            if maze[index - N] != maze[index]:
                adjacency[index - N].append(index)
                adjacency[index].append(index - N)
        if j > 0:
                if maze[index - 1] != maze[index]:
                    adjacency[index - 1].append(index)
                    adjacency[index].append(index - 1)





def BFS(adjacency, visited, distance, start):
    q = deque()
    q.append(start)
    visited[start] = True
    distance[start] = 1

    while q:
        v = q.popleft()
        for n in adjacency[v]:
            if not visited[n]:
                q.append(n)
                visited[n] = True
                distance[n] = distance[v] + 1



BFS(adjacency,visited,distance,0)
print(distance[size-1])

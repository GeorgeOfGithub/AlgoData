
import queue

N, M = list(map(int, input().split()))

adj = [[] for _ in range(N)]
semester = [None for _ in range(N)]
indegree = [0 for _ in range(N)]

# byg graf
for _ in range(M):
    x, y = list(map(int, input().split()))

    adj[y-1].append(x-1)
    indegree[x-1] +=1

q = queue.Queue()

# indegree 0
for i in range(N):
    if(indegree[i] == 0):
        semester[i] = 1
        q.put(i)

while(not q.empty()):
    a = q.get()

    for b in adj[a]:
        indegree[b] -= 1

        if (indegree[b]==0):
            semester[b] = semester[a]+1
            q.put(b)

print(max(semester))
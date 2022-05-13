import queue


N = int(input())
letters = [None for _ in range(N)]

for i in range(N):
    letters[i] = input()

adj = [[[] for _ in range (N)] for _ in range(N)]
visisted = [[False for _ in range(N)] for _ in range(N)]
numletters = [[-1 for _ in range(N)] for _ in range(N)]

for i in range(N):
    for j in range(N):
        if(i != N-1 and letters[i][j] != letters[i+1][j]):
            adj[i][j].append((i+1,j))
            adj[i+1][j].append((i,j))

        if(j!= N-1 and letters[i][j] != letters[i][j+1]):
            adj[i][j].append((i,j+1))
            adj[i][j+1].append((i,j))

q = queue.Queue()
q.put((0,0))
numletters[0][0] = 1

while(q):
    i,j = q.get()

    if(i==N-1 and j == N-1):
        print(numletters[i][j])
        break
    
    for i2 , j2 in adj[i][j]:
        if(not visisted[i2][j2]):
            q.put((i2,j2))
            visisted[i2][j2] = True
            numletters[i2][j2] = numletters[i][j]+1
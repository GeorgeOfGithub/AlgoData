class Unionfind():
    def __init__(self,N):
        self.id = [i for i in range(N)]
        self.size = [1]*N
    
    def find(self, i): 
        # as long as i has a parent it goes to i and then returns parent
        while (i!=self.id[i]):
            i = self.id[i]
        return i

    def union(self, c1, c2):
        r1 = self.find(c1)
        r2 = self.find(c2)
        if self.size[r1] < self.size[r2]:
            r1, r2 = r2, r1
            # this means swapping these 2
        self.id[r2] = r1
        self.size[r1] =+ self.size[r2]

    def find_rec(self, i):
        if self.id[i] != i:
            self.id[i] = self.find_rec(self.id[i])
        return self.id[i]

N, M = map(int, input().split())
Network = Unionfind(N)


for _ in range(M):
    connected = True
    print(connected)
    a,b,c = input().split()
    if a == "A":
        # add
        Network.union(int(b), int(c))
    else:
        connected = Network.find(int(b) == Network.find(int(c)))
        #print(Network.find(int(b)))
        #print(Network.find(int(c)))
        print(connected)
        #print("YES") if connected else print("NO")
        # if statement in one line

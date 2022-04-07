class UnionFind:
    def __init__(self,n):
        self.p = list(range(n))
        self.s = [1]*n

    def find(self, i):
        if self.p[i] != i: self.p[i] = self.find(self.p[i])
        return self.p[i]

    def union(self,i,j):
        r_small, r_great = self.find(i), self.find(j)
        if self.s[r_small] > self.s[r_great]:
            r_small, r_great = r_great, r_small
        if r_small != r_great:
            self.s[r_great] += self.s[r_small]
            self.p[r_small] = r_great



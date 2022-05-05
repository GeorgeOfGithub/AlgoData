# preorder traversal

import sys
sys.setrecursionlimit(5000)

class Bnode():
    def __init__(self,key):
        self.left = None
        self.right = None
        self.key = key


N = int(input())

blist = [0] * N

blist[0] = Bnode(int(input()))

for i in range(1,N):
    line = input().split()
    blist[i] = Bnode(int(line[2]))

    if line[1] == 'L':
        blist[int(line[0])].left = blist[i]
    else:
        blist[int(line[0])].right = blist[i]

def pre_order(x):
    if x is None:
        return ""
    s = " " + str(x.key)
    return s + pre_order(x.left) + pre_order(x.right)

print(pre_order(blist[0]))
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

def pre_order(root):
    if root is None:
        return ""
    s = " " + str(root.key)
    return s + pre_order(root.left) + pre_order(root.right)

print(pre_order(blist[0]))
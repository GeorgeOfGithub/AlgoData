
class Node:
   def __init__(self, key):
      self.next = None
      self.key = key

class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
    
    def push_front(self,key):
        n = Node(key)
        if self.head is None:
            self.head = n
            self.tail = n
        else:
            n.next = self.head
            self.head = n

    def push_back(self,key):
        n = Node(key)
        if self.tail is None:
            self.head = n
            self.tail = n
        else:
            self.tail.next = n
            self.tail = n

    def pop(self):
        res = self.head.key
        if(self.head == self.tail):
            self.head = None
            self.tail = None
        else:
            self.head = self.head.next
        return res


n = int(input())

l = LinkedList()

for _ in range(n):
    inp = input().split()
    if inp[0] == "PU":
        l.push_front(int(inp[1]))
    else:
        print(l.pop())


# brug push_back i stedet for push_front når man skal lave en queue
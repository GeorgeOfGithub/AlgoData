class HashMap():
    def __init__(self, N) -> None:
        self.table = [[] for _ in range(N)]
        self.values = [[] for _ in range(N)]
        self.size = N

    def __find(self, key):
        index1 = hash(key) % self.size
        if key in self.table[index1]:
            return index1,self.table[index1].index(key)
        return index1, None
    
    def insert(self, key, value):
        index1, index2 = self.__find(key)
        if index2 is not None:
            self.values[index1][index2] = value
        else:
            self.table[index1].append(key)
            self.values[index1].append(value)
    
    def get(self, key):
        index1, index2 = self.__find(key)
        if index2 is None:
            return None
        return self.values[index1][index2]


N = int(input())

h = HashMap(N)
duplicates = 0

for _ in range(N):
    inp = input() #Skal være string og ikke int for at python vil hashe det
    value = h.get(inp)

    if value is None:
        h.insert(inp, False)
    else:
        if not value:
            duplicates += 1
            h.insert(inp ,True)
        else:
            continue

print(duplicates)

# alternative med inbygget python funktion, må gerne laves til eksamen

# h = dict()

# N = int(input())

# duplicates = 0
# for _ in range(N):
#     inp = input()
#     value = h.setdefault(inp,1)
#     if value == 2:
#         duplicates += 1

#     h[inp] = value +1

# virker måske
# hasht = dict()

# N = int(input())

# duplicates = 0
# for _ in range(N):
#     id = input()
#     if id in hasht:
#         if hasht[id] == 1:
#             duplicates += 1
#             hasht[id] = 2

#     print(duplicates)






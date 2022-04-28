## 1.1
0->4->5,0->2->9->10->11->7,0->6,2->3,2->8.
1,6
2,4
3,10
4,3
5,7
6,12
7,20
8,8
9,8
10,12
11,14

## 1.2
Because dijkstra uses length which must be positive
See picture

## 1.3
We look at the length to each vertice according to T and see if any of the lengths are wrong, by relaxing each edge from each vertice before 

## 1.4
No, because now we go through the least amount of edges as each edge costs more.

## 2.1
Use dijkstras algorithm to find the shortest path in the network

## 2.2
Add 5 to the cost of all edges except the first edges before any vertice and then update. this is because each edge passes through a box. 

## 2.3
Minimum spanning tree instead, because now we just want the shortest path all in all and not just the shortest path to each node. 
Therefore use prims algorithm.

## 3
When relaxing, instead of finding the lowest number, find the largest of the 2 numbers.
if(v.d > u.d + w(u,v))
    v.d = u.d+ w(u,v)
    decreas-key(P,v,v.d)
    v.pi = u

instead do
if(v.d < u.d + w(u,v))
    v.d = u.d+ w(u,v)
    decreas-key(P,v,v.d)
    v.pi = u

Also instead of using a minimum heap the use a maximum heap and extract max. 

## 4


## 5.1
So dijkstras algorithm takes the amount of edges log amount of vertices, O(edges log vertices). The amount of edges in this binary tree is n-1 + n/2 which in O-notation is just n and therefore the O-notation is O(n log n)

## 5.2
You go to all roots and find the way back after that and then choose the cheapest way back to the top. 
Use BFS until you go to the root and then when all ways back have been marked you can now choose the lowest cost. And then use BFS for the rest of the tree.


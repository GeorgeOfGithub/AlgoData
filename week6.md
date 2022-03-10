## 1.1 
array 0[4,5,1]
array 4[0,9,3]

## 1.2
den kører bare hele vejen rundt
tiden er 24

## 1.3
først markerer den 0
så 4,5 og 1
så 3,9
så 8,7
så 6,2
tiden er igen 24

## 1.4
a connected components er alle sammen
b er også alle

c er 0,4,9,5 og 2,6,7,1,3 og 8

## 1.5
c er bipartite

## 2
Man putter alle naboerne i en stack og så popper den øverste og går ned til den og smider dem i stacken og popper den øverste.

## 3
Der bruges breath-first algo og så kører man for evigt igennem indtil man endten rammer den samme 2 gange eller kommer igennem alle lag.
det vil så tage antal lag tid

## 4
Der bruges breath-first fra begge sider for at sikre at det er den korteste vej, breath first finder normalt den korteste vej

## 5.1

n = O(k^2)
m = 2* k * (k-1)
m = O(k^2)

## 5.2
You take each field as a vertice and each of the sides as an edge if there is a wall. In the end there is a graph with k^2 vertices and at most k^2+k^2 edges

## 5.3


## 5.4
we just use BFS to see if it is all connected and if there is a cyclic path. 

## 7.1
because if you have an uneven amount of edges in a vertice you have to visit the vertice for example twice if there are 3 edges, but then you have to leave through an edge already visited. You also have to go back to where you started so you cant just stop at a vertice with 3 edges. 

## 7.2
because you dont have to stop at the one you started in you can add an extra edge at the start or end

## 7.3
1 is yes
2 is no
3 is no

## 7.4
breath first and if all vertices are met twice then it is true

## 7.5




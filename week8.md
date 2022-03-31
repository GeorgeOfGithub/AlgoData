## 1.1
0,1,2,3,4,5,6
0,1,2,34,5,6
1,2,34,50,6
1,2,3450,6
1,2,3450,6
2,34501,6
26,3450
26,3450
345062

## 1.2
0,1,2,3,4,5,6
0,1,2,43,5,6
1,2,43,05,6
1,2,0453,6
1,2,0453,6
2,01453,6
01453,62
6201453

## 1.3
0,1,2,3,4,5,6
0,1,2,43,5,6
1,2,43,05,6
1,2,0453,6
1,2,0453,6
2,01453,6
01453,62
6201453

## 1.4
        6
      2   0
         1 4  
           5 3

leaf    6
      2 0 4 3
        1 5

internal node depth 1
        6
      2 0 4
        1 5 3

internal node height 1
        6
      2 0 4
        1 5 3


## 1.5
init(9)
union(0,1)
union(1,2)
union(2,3)
osv.
så kommer det bare til at være en lang linje ned

## 1.6
Man kan ikke komme langt ned, da det højeste er log2 n, så det bedste er at bygge 1 af den største man kan som maks er 2 høj og så kombinere dem i en der er 3 høj.


## 1.7



## 2
union(i,j)
if Find(i)!=Find(j) then
    for ( k=0; k=n-1; k++)
        if (id[k] == id [i])
            id[k] = id[j]
Den passer over for hvad der står på slide 7 union find. 

## 3
Brug DFS på den ene man gerne vil se om den sidder sammen og ser om den markerer den anden man gerne vil finde. Dette tager lang tid i forhold til union find. 


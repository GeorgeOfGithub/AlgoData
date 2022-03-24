## 1.1
2,7,11,10

## 1.2
den første vil finde 7, den anden vil finde 11 som er max

## 1.3

## 2
Præcist det samme som med peaks, bortset fra at man så kigger på at begge naboer skal være større end

## 3

## 4.1
Der vil altid være en maximum-værdi og denne vil så altid være peak

## 4.2
hver anden kan være peak og derfor er det halvdelen af array.length

## 4.3


## 5.3
for den første vil det være at peak er den sidste 
for den anden vil det være at peak er den første og array er langt
for den tredje vil det være hvis peak er placeret således at man skal igennem flest iterationer

## 5.4
while(true)
m = i+j/2
if array[i] > array[i+1]
return i
if array[j-1] > array[j-2]
return j-1;
if array[m] > array[m+1] && array[m] > array[m-1]
return m
if array[m+1] > array[m]
i++;
if array[m-1] > array[m]
j++;
"run again"

## 5.5
Fordi den rekursive altid kigger på midtens naboer vil den så dermed sørge for at mindst en værdi vil være en peak. 

## 6.1
if (N>=m)  
go to N
if (E>=m)
go to E
if (S>=m)
go to S
if (W>=m)
go to W
repeat until none of these are true and then peak is found

## 6.2
Kig på midterste række og brug rekursivt til at finde den højeste værdi og så ser om venstre eller højre side er højere end dette og laver rekursivt den høje vej og bliver ved med det indtil man når at der ikke er nogen på højre eller venstre side og dermed er man nået peak.

## 6.3

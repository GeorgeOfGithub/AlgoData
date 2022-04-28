## 1.1
Vi tager bare mod til alle tallene og ser på hvilken placering vi sætter dem ind på arrayet eller til højre for.
11
1,12
2,
3, 14, 25
0
0
7, 18
0
0
0
0

## 1.2
Vi tager bare mod til alle tallene og ser på hvilken placering vi sætter dem ind på arrayet eller til højre for.
51
1
2
17 - Denne her sættes ind her fordi den skal placeres til højre for 51, men de er allerede brugt
0
0
0
0
42
43
77
111
0
0
0
32
16

## 1.3
51 fjernes og 1 og 2 sættes ind igen og så sættes 17 på 51 plads
17
1
2
0
0
0
0
0
42
43
77
0
0
0
0
32
16

## 1.4
Array bygget af mod 10.
Hvis man fjerner 22 fra dette array og ikke flytter 42 tætter på 2 vil det ikke se ud som om at 42 passer med 42 mod 10

0
1
2
22
42
5
6
0
0

## 1.5
Array med mod 10 i chained hashing
10000000
1
2
3
4
Der er ikke nogen måde at gøre det på, fordi man netop med mod splitter det op tilfældigt

## 2.1
Fordi at mange af dem går direkte op i 10 og derfor sætter sig på 0 eller også sætter de sig på 5
fx chained hashing
0,20,40,90,80
0
0
0
0
5,65,95,55

## 2.2
Fordi tal ikke går op i primtal og derfor bliver tallene mere spredt ud.

## 3

## 4.1
Markeringen skal bare fungere som at det er et tal som når man modulus det, sådan at search og insert bare hopper over det.

## 4.2
Det gode er at man ikke skal bruge tid på at reinserte.
Det dårlige er at man så skal søge igennem allerede slettede tal og derfor kan search og insert tage længere tid hvis man sletter meget.

## 5.1
Se også opgave 3, de minder rigtigt meget om hindanden.

Man bruger chained hashing til at sætte ID ind i et array og så når en ny player kommer ind, tjekker man array-placeringen for om ID'et allerede har været der og så ikke tilføjer hvis det allerede findes.

## 5.2
Man gør det samme, men hvert unikt ID har en key som fortæller hvor mange gange spilleren logger ind og så når man ser at de logger ind igen lægger man 1 til keyen. 


## 6.1
Disse opgaver er svære og har ikke noget med hasing at gøre. Det handler om bitoperationer og bitshifting og xor. Et word består af længden 64 eller 32 bit, alt efter computer typen.

Hvis man gerne vil have adgang til i bit i et bitarray, bitshifter man arrayet i gange således at man har den man gerne vil læse først og så and'er på dens plads med en 1 bit og så ser om den bliver flippet eller ej og dermed kan man læse det.

## 6.2
Hvis man har flere "words" bruger man i/w til at finde det "word" som i ligger i og så bruger man i modulus w for at finde placeringen i det bestemte w.

## 6.3






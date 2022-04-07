## 1.1
5->6, 6->7, 7-> 2->4, 2->3, 2->1, 1->0, 3->8

## 1.2
0->1, 0->5, 5->6, 6->7, 7->2, 2->4, 2->3, 3->8

## 1.3
de minder om hinanden, den eneste forskel er om man tager 0->5 eller 1->2

## 1.4
primms og kruskals er begge to effektive til at finde minimum spanning tree

## 3.1
3->7, 1->5, 8->7, 0->5, 4->5, 4-6, Nu kan man ikke fjerne flere.

## 3.2
den fjerner alle de tungeste som kan fjernes og derfor har man alle de laveste edges kun og dermed har man MST

## 4.1
Fordi man skal forbinde 2 vertices og det skal være den laveste betyder det at den automatisk bliver sat ind i MST. Fordi du rammer alle noder rammer du alle edges og dermed rammer man altid den laveste og forbinder sig til den. Hvis de alle har samme vægt kan man ramme den tungeste ellers er det ikke muligt at forbinde sig til den tungeste. 

## 4.2
Den vil ikke være anderledes, slutresultatet vil bare blive større med c. 

## 4.3
Ja, fordi man skal tage den laveste og der er altid kun 1 som er lavest og derfor kun 1 vej rundt i MST. 

## 4.4
se opgave 6.2 hvor prims og kruskal ses til at finde flere forskellige MST som alle vil være MST, selvom man kan gå flere forskellige veje.

## 5
Man tager prims og kruskal bare med de højeste i stedet for de laveste man skal finde.

## 6.1
Som set i 1.1 og 1.2 må man så selv vælge hvilken en man så går videre med i sit MST. Det vil stadig lave en MST. der kan så bare være flere forskellige MST. Hvis nu alle vægt var ens kunne man bare forbinde tilfældigt så længe der ikke er en cyklus.

## 6.2
igen som set i 1.1 og 1.2
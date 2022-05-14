## 1.1
Persons er vertices og infections er edges. Derfor skal det være en directed graph, hvor den peger mellem vertices når nogen infeceres af andre.

## 1.2
Vi skal finde alle vertices som har indegree 0, da de er patient-zero. Vi går igennem alle edges for at finde alle indegree. Det tager I tid at gå igennem alle edges og P tid at gå igennem allle vertices. Derfor O(P+I). 

## 1.3
Vi skal nu finde om den directed graph er cyclic eller ej. Derfor skal man bruge topologisk sortering, for at tjekke om der er topologisk sortering. Dette tager I+P+I+P=O(I+P)

## 1.4
Vi har nu en DAG. Vi laver nu en weighted directed graph. Så finder vi shortest path og dermed finder den hurtigste vej mellem P1 og P2. Derfor er det I+P+I+P = O(I+P)


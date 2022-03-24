## 1.1
a, b, not c

## 1.2
A, not B, not C

## 1.3
21, 11

## 1.4
Yes, if first place has been removed

## 1.5
on the lowest row, not necesarrily on the most left or right

## 1.6
because we use bubbleup and bubbledown after each of the operations heap order is maintained

## 1.7
We insert the lowest from every array and put them into a heap, this takes log(k) time. then we extractmax and insert from the array that lost an element and do that n times. Therefore it is 
O(n * log(k))

We use a heap
## 2.1
extractmax m times so extractmax takes log n time. 

## 2.2
Just remove the element and then use bubble down like in extract max. this will take log(n) time

We delete twice for x and y and add their keys together and insert z with that key this is 3 times log(n), therefore 3*log(n) and therefore O(log(n))

## 2.3
So we look at the largest and then look at the children and see if they are larger than the one we want to find.

## 2.4
We create 2 heaps, one max heap and one min heap, so we can either remove the largest or lowest with almost the same operations. This will just take 2*log(n) time which is log(n) time asymptotically.

## 3
So each element in the heap has an extra part besides the index it is sorted after, this part has the sattelite data stored and can be accessed via the element. 

## 4.1
first row has 1 element, second row has 2, third has 4, and so on. the height of the tree is the amount of row-1. Because each node has 2 lower than itself it is 2^h, then we have a level lower because the heigh has to stemme overens.

## 4.2
The sum goes asymptopically towards the amount of nodes when the fraction goes towards infinity. So the fraction you add with becomes smaller and smaller when the sum goes towards the amount of nodes n.

## 5.1
























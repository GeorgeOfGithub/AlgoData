## 1.1
first we add 4, then add 1, then add 3, then remove 3, then add 8, then remove 8
## 1.2
Just push them all

## 1.3
add 4, then add 1, then 3, then remove 4, then add 8, then remove 1

## 1.4
you make 2 stacks. when you want to dequeue from the stack you first pop everything from the first stack and add it in opposite order to the other stack. Now when you pop you remove it first to last instead of last to first. this is done until it is empty and then it is repeated every time you want to dequeue.

## 2
number c

## 3.1
first c is 0, then we go to the next link and add +1 to c, so c is 1. Then the next link and c is 2 and then the next link so c is 3. Then we go to the next last one and c is 4. Finally last link and c is 5 and x is now null.

## 3.2
Foo computes the number of links.


## 3.3
first x is 0 and s i added by 7. Then we go to the next link and s is +42 so it is 49. next link and s is +18 and therefore 67. next is 23 and therefore 90. then 95 and now the x is x.next, which is null and we end.

## 3.4
bar adds all links together.


## 4.1
we go 2 places forward with x.next, so one link is basically removed.


## 4.2
t is added as the next element in the array.

## 4.3
now t is added after x, but t.next is t again and therefore it doesnt work, because t.next points to itself.

## 6.1
We go through each entity in the linked list and see if x is lower than the number and x.next is higher or equal to the number and if that is true then we say x.next is the new number and x.next.next is equal to the earlier x.next

## 6.2
If you are allowed to do x.next.next.next... until you are halfway through the n integers, then yes it is faster. If not, then no it is not faster, because you can't do it.



## 7
So we have x.current and then we change x.prev and x.next around.
https://www.geeksforgeeks.org/reverse-a-linked-list/ 


## 8.1
Yes, if every prisoner flicks a switch when they come into the room and the last prisoner can then see that every switch except one is flicked and therefore every prisoner has been in there. If a prisoner goes in twice he doesnt do anything.

## 8.2
It is like if it is bits instead. so we go from 0 to 32 in binary and when every switch is flicked on we are at 32.  If a prisoner goes in twice he doesnt do anything.
2^5 = 32

## 8.3
Only one prisoner can turn on the light. Prisoners can only turn off the light once. So when a prisoner comes in twice he just leaves the light. when the turn on prisoner has turned on the light 32 times he knows every prisoner has been in there.


## 9.1
We create a new array from the last array and then put every part of the array except the the last or first one. 

## 9.2




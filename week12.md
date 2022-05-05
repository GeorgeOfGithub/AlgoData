## 1.1
b not a and c

## 1.2
the smallest is to the most left and the largest is to the most right

## 1.3
start with 10 at root and then have 16 and 17 and 21 where it becomes more and more left-leaning

## 1.4
inorder: 1,2,7,8,9,10,13,17,18
preorder: 9,7,2,1,8,17,13,10,18
postorder: 1,2,8,7,10,13,18,17,9

## 1.5
heaps have to have the highest key at the root and go lower and lower.
BST can have higher as children as long as they are on the right side.

## 1.6
start at root
go to left child until no more and then mark lowest then go up, mark, and see if you can go down right child and mark that and go up and to the right and keep going

## 1.7
because successor by definition finds the next one going higher there are no keys between them and therefore it cant have something lower than itself, the same goes for predessor.


## 2.1
go through each child and count it if it has no children

## 2.2
go through each child and count the height it has no children and then take the heighest height


## 3.1
with this algorithm we go through each and every node, as we start in the top and take its children and their children and so forth. We do not do anything at each node and therefore the running time is only linear with n nodes and therefore O(n)

## 3.2
we start with the subroot x and do Zero(x) of it and then we have and integer that counts up for each iteration
InitSize(x)
if x!=null then
    InitSize(x.left)
    InitSize(x.right)
    x.size = 1 + x.right.size + x.left.size
end if
return 0

Now we do an extra calculation for each node. This does not change much as it is now 2 calculations for each node and therefore 3*n = O(n)

## 3.3
We need to see if the size of the rest of the subtree is more than double as large as the childs subtree. Therefore we first do InitSize for the whole tree and then do something like this were we use the x.size
RedEdge(x)
if x!=null then
    r = RedEdge(x.right) + RedEdge(x.left)

    if x.right != null then
        if x.size > 2*x.right.size then
            r += 1
        end if
    end if

    if x.left != null then
        if x.size > 2*x.left.size then
            r+= 1
        end if
    end if

    return r
end if
return 0

This is still a linear algorithm as we still only do some extra calculations per node.

## 3.4
every leaf is a red edge at least and then for each pair, one is red and the other is not unless each side is the same size. Therefore the absolute worst case is when we have a binary seach tree that is mirrored on each side. This has every edge be red. O(n)

## 4.1
We just need to check if each child is smaller and larger than v.key

RealTree(v)
if v!= null then
    Find max and find min of RealTree(v.right) and RealTree(v.left) ->
    max = RealTree(v.right)
    min = RealTree(v.left)


    if min > v.key or max < v.key
        return error!
    end if
    if max>v.key then
        max = v.key
    end if

    if min < v.key
        min = v.key
    end if

end if

If nothing is wrong then nothing will happen and it will just go through the tree

## 4.2
Use preorder to get the tree in the correct order and then just reverse the greater than and smaller than.

## 4.3
Use preorder traversal of both T1 and T2 and you have 2 arrays with them sorted as a binary search tree. Takes linear time
Merge the 2 arrays.
Now we have a binary tree going from lowest to highest.

## 5
Use the middle most key in the array and use as root. Left and right are the 2 children built by those arrays and then take the middle again and again. 
Time is log2(2^h+1) = h

## 7.1
PrintTree(x)
if x!= null then
    print x.color
    if x.left != null then
        PrintTree(x.left)
    end if
    if x.right != null then
        PrintTree(x.right)
    end if
end if

Just change it from going from left to right ro right to left
PrintTree(x)
if x!= null then
    print x.color
    if x.left != null then
        PrintTree(x.left)
    end if
    if x.right != null then
        PrintTree(x.right)
    end if
end if

## 7.2
Internal(x)
if x!= null then
    if x.left != null and x.right != null and x.parent != null then
        return Internal(x.left) + Internal(x.right) + 1
    end if
    return Internal(x.left) + Internal(x.right)
end if
return 0

## 7.3
R-Path(x)
if x.left!=null and x.right!=null then
    return true
end if

if x.left.color == R
    R-Path(x.left)
end if

if x.right.color == R
    R-Path(x.right)
end if

return false



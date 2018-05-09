## Binary Heap

Heap is a data structure based on complete binary tree.

* Time complexity

    Insert : O(log n)

    Delete : O(log n)

```
Ex)
          Root
        /      \
       A        B
      / \      / 
     C   D    E   
```

#### - Min heap

The value of Root is smallest value.

The value of each node must smaller than its child nodes.

#### - Max heap

The value of Root is the maximum value.

The value of each node must larger than its child nodes.

- Source Code: MaxHeap.java

    Heap is made of array.

### Reference
https://algorithms.tutorialhorizon.com/binary-min-max-heap/

## Quick Sort
* Time Complexity
Average: O(nlgn)

Worst case: O(n^2)

(The worst case could be when the first element is selected as a pivot.)

* How to Quick sort
Divide and Conquer 

Unsorted Array: [11 13 4 16 1]

1. Choose any element as a pivot (I'll choose the middle of the array.)

[11 13] [4] [16 1]

2. Arrange the elements based on the pivot

The Elements which are smaller than pivot element will be located in left side,

and the other larger ones will move to right side.

[1 13] [4] [16 11]

[1 4] [13 16 11]

3. Recursively do the same thing to each left([1 4]) and right([13 16 11]) arrays.

[1] [4] [11] [13] [16]


* Unstable sort






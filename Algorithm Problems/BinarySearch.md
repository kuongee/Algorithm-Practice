# Binary Search

Binary search can be applied to **sorted array**.

Time Complexity: O(logn)

vs. Linear search : O(n)

1. Recursion

2. Iteration

```java
public int BinarySearchRecursion(int sItem, int start, int end) {
    System.out.println(start + " " + end);
    if(start == end) 
        return -1;
    
    int mid = (start + end) / 2;
    if(array[mid] == sItem) {
        return mid;
    }
    
    if(sItem < array[mid])
        return BinarySearchRecursion(sItem, start, mid);
    if(array[mid] < sItem)
        return BinarySearchRecursion(sItem, mid + 1, end);
    
    return -1;
}
	
public int BinarySearchIteration(int sItem) {
    int start = 0;
    int end = array.length;
    
    while(start < end) {
        int mid = (start + end) / 2;
        if(array[mid] == sItem) {
            return mid;
        }
        
        if(sItem < array[mid]) {
            end = mid;
        }
        if(sItem > array[mid]) {
            start = mid + 1;
        }
    }
    return -1;
}
```






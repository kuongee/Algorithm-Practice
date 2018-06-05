## Traversing Graph

There are two ways to traverse graph that are DFS and BFS.

```
Ex)
    A
  /   \
 B     D
  \ 
   C
```
### DFS
#### Depth First Search

Solve DFS with **Stack**

This means implementing it with recursive function will be the same as using real stack data structure.

- Traverse the example graph
    A - B - C - D

### BFS
#### Breadth First Search

Solve BFS with **Queue**

- Traverse the example graph
    A - B - D - C

Check the visited vertex when you add that vertex in queue.

So that the overlapped vertex will not be add in queue. This way is faster.

### Code Explanation
**DFS_BFS_matrix.java** is the answer of BOJ problem 1260.

At first, I solved the problem with a graph that was formed as a list.(DFS_BFS_List.java)

However, there was a condition I missed.

That was if there are multiple vertices to visit, visit the one with the smallest vertex number first.

So I have to change the form of the graph as matrix so that I can visit the vertices in order.

※ BFS 중복 확인하는 부분을 queue add 하는 작업할 때 같이 해서 더 빠르게 한다. (백준 2178)
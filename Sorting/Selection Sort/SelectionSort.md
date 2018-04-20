## Selection Sort
Time Complexity: O(n^2)

Find smallest or largest one and put it into the sorted array or list

Unstable sort in my code but it could make be stable(I think).

- This sorting just finds the element and put it into the right place.

  This means when the element moves, it doesn't consider the initial location of the elements.

  Unstable happens during swapping.

  Example) [4*, 6, 4, 1, 3]
  
  Choose 1: 1, [6, 4, 4*, 3]
  
  Choose 3: 1, 3, [4, 4*, 6]

  Choose 4: 1, 3, 4, [4*, 6]

  Choose 4*: 1, 3, 4, 4*, [6]

  Final: 1, 3, 4, 4*, 6

- However, if I use another array for sorted elements, then that sort would be stable.  



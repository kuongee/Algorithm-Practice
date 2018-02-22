# Implementing Queue with Stack

The queue can be implemented with two stacks.

1. Queue

	==================<br />
	**head** <-&nbsp;&nbsp;&nbsp;Queue&nbsp;&nbsp;&nbsp;<- **tail** <br />
	==================

	- First In First Out

	- Inserting to **tail** / Deleting from **head**

2. Stack

	==================+<br />
	top <- pop &nbsp;&nbsp;&nbsp;|
            -> push&nbsp;&nbsp;&nbsp;|
	==================+<br />

	- Last In First Out

	- Elements are pushing to **top** and poping from the **top**.

## How can the queue be implemented with stacks?

We need two stacks for implementing queue.

One is for just inserting the elements. Another one is for deleting the 

elements.

In the code and the figure in the bottom, for example. stack1 is for inserting 

and stack2 is for deleting.

When the queue implemented with two stacks wants to insert, the first stack 

pushes the element. 

Whenever the queue is going to delete the element, the element will be popped 

from the second stack.

However, if the second stack is empty, every elements need to move from stack1.

On the other hands, if the second stack isn't empty, the queue should delete the 

elements from the second stack.

Inserting
|
|	<stack1>
|	=========+
+---->&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  |
+--------- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   |   	   
|	=========+
|	
|	<stack2>
|	=========+
+---->&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  |
+--------- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   | 
|	=========+
|
+--->deleting
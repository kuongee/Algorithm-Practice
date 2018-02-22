# Queue and Stack

The queue can be implemented with two stacks.

1. Queue
	- First In First Out

	==================<br />
	**head** <-&nbsp;&nbsp;&nbsp;Queue&nbsp;&nbsp;&nbsp;<- **tail** <br />
	==================<br />

	- Inserting to **tail** / Deleting from **head**

2. Stack
	- Last In First Out

		==========+<br />
	top <- pop &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br />
            -> push&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br />
	==========+<br />

	- Elements are pushing to **top** and poping from the **top**.

## 1. How can the queue be implemented with stacks?

We need two stacks for implementing queue.

One is for just inserting the elements. Another one is for deleting the elements.

In the code for example, stack1 is for inserting and stack2 is for deleting.

When the queue implemented with two stacks wants to insert, the element is pushed to the first stack.

Whenever the queue is going to delete the element, the element will be popped from the second stack.

However, if the second stack is empty, every elements need to move from stack1.

On the other hands, if the second stack isn't empty, the queue should delete the elements from the second stack, before move from stack1.

## 2. How can the stack be implemented with queue?

Reference: https://code.i-harness.com/ko/q/a8094

1) Stack implemented with two queues

	File name: StackWithTwoQueue.java

2) Stack implemented with one queues

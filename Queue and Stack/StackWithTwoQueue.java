/* 
 * File name: StackWithQueue.java
 * Written by: Jeesoo Min
 * Date: Feb 22, 2018
 * The stack can be implemented with two queues.
 * One of queue is using as pushing and the other one is using as popping.
 * Elements are integers larger than zero.
 * Idea Reference: https://code.i-harness.com/ko/q/a8094
 * */

public class StackWithTwoQueue {
	int max;
	int top;
	// Stack with two queues
	myQueue queue1, queue2;
		
	StackWithTwoQueue(int num) {
		max = num;
		top = 0;
		queue1 = new myQueue(num); // push
		queue2 = new myQueue(num); // pop
	}
	
	public void push(int e) {
		top++;
		if(queue1.isEmpty()) {
			if(!queue1.isFull()) {
				queue1.insert(e); 
				while(!queue2.isEmpty())
					queue1.insert(queue2.delete());
			}
		}
		else { // move to queue2
			if(!queue2.isFull()) {
				queue2.insert(e);
				while(!queue1.isEmpty())
					queue2.insert(queue1.delete());
			}
		}
	}
	
	public int pop() {
		top--;
		if(!queue1.isEmpty()) {
			return queue1.delete();
		}
		else {
			if(!queue2.isEmpty()) {
				return queue2.delete();
			}
			else {
				System.out.println("Nothing to pop");
				return -1;
			}
		}
	}
	
	public boolean isEmpty() {
		if(top == 0)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(top == max)
			return true;
		else
			return false;
	}
	
	public void printStack() {
		System.out.println("<queue1> ");
		queue1.printQueue();
		System.out.println("<queue2> ");
		queue2.printQueue();
		
	}
	
	public static void main(String [] args) {
		StackWithTwoQueue qStack = new StackWithTwoQueue(5);
		if(qStack.isEmpty()) {
			qStack.push(1);
			qStack.push(2);
			qStack.push(3);
			qStack.push(4);
			qStack.push(5);
			if(qStack.isFull()) {
				qStack.printStack();
				qStack.pop();qStack.pop(); qStack.pop(); qStack.pop(); qStack.pop(); 
				if(qStack.isEmpty())
					qStack.push(6);
				qStack.printStack();
			}
			
		}
		
	}

}

class myQueue { // Circular queue
	int [] elements;
	int max;
	int head, tail;
	
	myQueue(int num) {
		elements = new int[num + 1]; // Always one empty space
		max = num + 1;
		head = tail = 0;
	}
	
	public void insert(int e) {
		elements[tail] = e;
		tail = (tail + 1) % max;
	}
	
	public int delete() {
		int elem = elements[head];
		elements[head] = 0;
		head = (head + 1) % max;
		return elem;
	}
	
	public boolean isFull() {
		if((tail+1)%max == head) 
			return true;
		else
			return false;
	}
	
	public boolean isEmpty() {
		if(tail == head)
			return true;
		else
			return false;
	}
	
	public void printQueue() {
		for(int i=0; i<max; i++) {
			System.out.print("--");	
		}
		System.out.println();
		for(int i=head; i<(head+max-1); i++) {
			if(elements[i%max] > 0)
				System.out.print(elements[i%max] + " ");
		}
		System.out.println();
		for(int i=0; i<max; i++) {
			System.out.print("--");	
		}
		System.out.println();
	}
	
}

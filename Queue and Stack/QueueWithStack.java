/* 
 * File name: QueueWithStack.java
 * Written by: Jeesoo Min
 * Date: Feb 22, 2018
 * The queue is fimplemented with two stacks.
 * One of stacks is used for insert function and another one is for delete function.
 * Elements are integers larger than zero.
 * */
public class QueueWithStack {
	int max = 0;
	myStack stack1; // is for only inserting.
	myStack stack2; // is for only deleting.
	
	QueueWithStack(int num) {
		System.out.println("Implementing Queue with two stacks!");
		stack1 = new myStack(num);
		stack2 = new myStack(num);
		max = num;
	}
	
	public void insert(int e) {
		if(!stack1.full()) {
			stack1.push(e);
		}
		else 
			System.out.println("Cannot insert anymore!");
	}
	
	public int delete() {
		if(stack2.empty()) {  // if stack2 is empty
			if(stack1.empty()) {
				System.out.println("Nothing to delete");
				return -1;
			}
			while(!stack1.empty()) { // until stack1 is empty, move elements to stack2 
				stack2.push(stack1.pop());
			}
		}
		int elem = stack2.pop();
		System.out.println("delete " + elem);
		return elem;		
	}
	
	public void printQueue() {
		for(int i=0; i<max * 2; i++) {
			System.out.print("--");	
		}
		System.out.println();
		for(int i=max-1; i>=0; i--) {
			if(stack2.elements[i] > 0)
				System.out.print(stack2.elements[i] + " ");
			
		}
		for(int i=0; i<max; i++) {
			if(stack1.elements[i] > 0)
				System.out.print(stack1.elements[i] + " ");
			
		}
		System.out.println();
		for(int i=0; i<max*2; i++) {
			System.out.print("--");	
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		QueueWithStack sQueue = new QueueWithStack(5);
		sQueue.insert(4);
		sQueue.insert(5);
		sQueue.insert(6);
		sQueue.insert(7);
		sQueue.insert(8);
		sQueue.insert(9);
		sQueue.delete();
		sQueue.delete();
		sQueue.delete();
		sQueue.delete();
		sQueue.delete();
		sQueue.delete();
		sQueue.printQueue();
		sQueue.insert(3);
		sQueue.insert(4);
		sQueue.printQueue();
	}

}

class myStack {
	int top = -1;
	int max = 0;
	int [] elements;
	
	myStack(int num) {
		top = -1;
		elements = new int[num];
		max = num;
	}
	
	public void push(int e) {
		elements[++top] = e;	
	}
	
	public int pop() {
		int elem = elements[top];
		//System.out.println("Pop element! " + elem);
		elements[top--] = 0;
		return elem;
	}
	
	public Boolean full() {
		if (top < max-1)
			return false;
		else {
			//System.out.println("Stack full");
			return true;
		}
	}
	
	public Boolean empty() {
		if(top < 0) {
			//System.out.println("Stack empty");
			return true;
		}
		else 
			return false;
	}
	public void print() {
		for(int i=0; i<max; i++) {
			System.out.print("--");	
		}
		System.out.println();
		for(int i=max-1; i>=0; i--) {
			System.out.print(elements[i] + " ");
		}
		System.out.println("|");
		for(int i=0; i<max; i++) {
			System.out.print("--");	
		}
		System.out.println();
		
	}
}
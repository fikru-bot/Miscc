package simple.java;
// stack, an abstract data structure, is a collection of objects that are inserted and removed
//according to the Last-In-First-Out  LIFO principle
public class Stack {
	static final int MAX = 1000;
	int top;
	int arr[] = new int[MAX];// the maximun size of stack
	
	boolean isEmpty() {
		return (top < -1);
	}
	Stack(){
		top = -1;
	}
	
	boolean push(int x) {
		if(top >= (MAX-1)) {
			System.out.println("stack overflow");
			return false;
		}else {
			arr[++top] = x;
			System.out.println(x + "pushed into the stack");
			return true;
		}
	}
	int pop() {
		if(top<0) {
			System.out.println("stack underflow");
			return 0;
		}else {
			int x = arr[top--];
			return x;
		}
	}
	int peek() {
		if(top < 0) {
			System.out.println("stack underflow");
			return 0;
		}else {
			int x = arr[top];
			return x;
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(12);
		s.push(43);
		s.push(67);
		System.out.println(s.pop() + "popped from stack");
		

	}

}

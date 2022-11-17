package collectionframework;

import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
	
	Stack<Integer> stack  = new Stack<>();
	
	stack.add(1);
	stack.add(2);
	stack.add(3);
	stack.add(4);
	
	
	stack.push(5);
	
	System.out.println(stack);
	
	
	System.out.println(stack.pop());
	
	System.out.println(stack);
	
	System.out.println(stack.peek());
	System.out.println(stack);
	
	while(!stack.isEmpty()) {
		System.out.println(stack.pop());
	}
	System.out.println("All removed");
	System.out.println(stack);
	
	
}
}

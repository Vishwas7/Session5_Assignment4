package Assignment4;
/*
 * In this program written a code in java to implement Stack operations 
 * like push, pop, peek without using  collections.
 */

import java.util.Stack;

public class StackOperations {//Creating class


		public static void main(String args[]) { // Main method
			
			// Now I'm creating stack
			Stack<String> st = new Stack<String>();
	        
			// Push operation 
			// Stack follows Last-In-First out approach
			st.push("Amit");  // Here I'm inserting element in the stack at the bottom 
			st.push("Raj"); // Here I'm inserting element in the stack at second position
			st.push("Vishwas"); // Here I'm inserting element in the stack at third position
			st.push("Barun");  // Here I'm inserting element at the top 
			
			System.out.println("Stack after PUSH operation: " + st);
			
			// checking the top element and prints it
	        System.out.println("Element at the top is: " + st.peek()); 
	        
	        
	        //Pop operation
			st.pop(); //Deleting element from the top 
			st.pop(); //Deleting element from second position
			st.pop(); //Deleting element from third position
			st.pop(); //Deleting element from the bottom 
			System.out.println("Stack is empty" + st); // Printing empty stack
			                                                
			             	}

	}


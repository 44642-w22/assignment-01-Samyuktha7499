package questions;

import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the even size of stack: ");
		int size = sc.nextInt();
		while(true) {
			if (size % 2 == 0) {
				break;
			}
			else {
				System.out.println("Sorry, you have entered odd size. Please enter even size again: ");
				size = sc.nextInt();
			}
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements to store in to the stack: ");
			stack.push(sc.nextInt());
		}
		
		questionSix(stack,size);

	}
	
	public static void questionSix(Stack<Integer> stack, int size) {
		ArrayList<Integer> A = new ArrayList<>();
		int p = size / 2;
		for (int i = 0; i < size; i++) {
			if(i < p) {
				A.add(stack.pop());
			}
			else {
				A.add(stack.get(i-p));
			}
		}
		System.out.println(A);
	}

}


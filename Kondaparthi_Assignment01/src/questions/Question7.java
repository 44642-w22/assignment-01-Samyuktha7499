package questions;

import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Queue: ");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements: ");
			Q.add(sc.nextInt());
		}
		questionSeven(Q,size);
	}
	
	public static void questionSeven(Queue<Integer> Q1, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + Q1.poll()*(int)(Math.pow(2, i));
		}
		System.out.println(sum);
	}

}


package questions;

import java.util.*;

public class Question8 {

	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Queue: ");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements to QUEUE: ");
			Q.add(sc.nextInt());
		}
	
		questionEight (Q,size);
		
	}
	
	public static void questionEight(Queue<Integer> Q1, int size) {
		ArrayList<Integer> A1 = new ArrayList<>();
		ArrayList<Integer> A = new ArrayList<>();
		for (Integer item: Q1) {
            A1.add(item);
        }
		
		for(int i = 0; i < size/2; i++) {
			A.add(A1.get(size-i-1));
			A.add(A1.get(i));
		}
		if (size % 2 != 0) {
			A.add(A1.get(size/2));
		}
		
		System.out.println(A);
	}
	
	
}

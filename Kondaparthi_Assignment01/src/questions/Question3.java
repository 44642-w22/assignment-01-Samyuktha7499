package questions;

import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		ArrayList<Integer> A1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array A1: ");
		int arraySize = sc.nextInt();
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter the elements: ");
			A1.add(sc.nextInt());
		}
		
		questionThree(A1);
	}
	
	public static void questionThree(ArrayList<Integer> A1) {
		if(A1.size() == 0) {
			System.out.println(Integer.MIN_VALUE);
		}
		else {
			Collections.sort(A1);
			System.out.println(A1.get(A1.size()-1));
		}
	}
}

package questions;

import  java.util.*;

public class Question4 {

	public static void main(String[] args) {
		ArrayList<String> A1 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array list A1: ");
		int arraySize = sc.nextInt();
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter the elements to store into array list A1: ");
			A1.add(sc.next());
		}
		
		questionFour(A1, arraySize);
	}
	
	public static void questionFour(ArrayList<String> A1, int size) {
		ArrayList<String> A2 = new ArrayList<String>();
		int [] arr = new int [size];
		for (int i = 0; i < size; i++) {
			arr[i] = A1.get(i).length();
		}
			
		Arrays.sort(arr);
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (arr[i] == A1.get(j).length()) {
					A2.add(A1.get(j));
					A1.set(j, "");
				}
			}
		}
		
		System.out.println(A2);	
	}
}


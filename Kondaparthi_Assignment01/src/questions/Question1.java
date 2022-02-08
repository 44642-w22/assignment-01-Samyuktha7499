package questions;

import java.util.LinkedList;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> L1 = new LinkedList<>();
		System.out.println("enter the size");
		int arraySize = sc.nextInt();
		while(arraySize>0) { 
			System.out.println("Enter the elements to the list : ");
	        L1.add(sc.nextInt());
	        arraySize--;  
	        }
	        sc.close();
	    questionOne(L1);
	}
	public static void questionOne(LinkedList<Integer> L1) {
    	LinkedList<Integer> L2 = new LinkedList<>();
    	for (int i = 0; i < L1.size(); i++) {
    		int a = L1.get(i);
    		int sum = 0;
    		for (int j=1; j<=a/2; j++) {
    			if (a%j == 0) {
    				sum += j;
    			}
    		}
    		if (sum == a) {
    			L2.add(a);
    		}
    	}
    	System.out.println(L2);
    }
}

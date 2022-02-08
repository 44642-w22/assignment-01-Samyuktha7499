package questions;

import java.util.*;

public class Question10 {

	public static void main(String[] args) {
		Deque<String> D = new ArrayDeque<>();
		List<Integer> A = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Deque");
		int len = sc.nextInt();		
		System.out.println("Enter the list of Characters for Deque");
		for(int i=1; i<=len;i++) {
			D.add(sc.next());
		}		
		System.out.println("Enter the length of Array of operations");
		int len_array = sc.nextInt();		
		System.out.println("Enter the Array of operations in 1 and 0 ");
		for(int i=1; i<=len_array;i++) {
			A.add(sc.nextInt());
		}		
		System.out.println("List of Deque : " + D);
		System.out.println("Array of operations : " + A);		
		Deque<String> D_dup = new LinkedList<>(D);
		Stack<String> str1 = new Stack<>();		
		for(int e : A) {
			switch(e) {
			 	case 1: if(!D_dup.isEmpty()) {
			 		str1.add(D_dup.pollFirst());
			 		break;
			 	}
			 	case 0: if(!str1.isEmpty()) {
			 		D_dup.addFirst(str1.pop());
			 		break;
			 	}
			}
		}		
		Iterator<String> objIterator = D_dup.iterator();  
		while(objIterator.hasNext())
		{
			System.out.print(objIterator.next());
		}
		sc.close();
	}	
}
package questions;

import java.util.*;

public class Question2 {

	public static void main(String[] args) {Scanner sc = new Scanner(System.in);
	LinkedList<Integer> L1 = new LinkedList<>();
	System.out.println("Enter the size of linked list L1: ");
	int listSize = sc.nextInt();
	System.out.println("Enter the value of k whose sum equal to pairs of continuous elements in L1: ");
	int k = sc.nextInt();
	while(listSize>0) { 
		System.out.println("Enter the elements to add into list L1: ");
        L1.add(sc.nextInt());
        listSize--;    
        }
        sc.close();   
        
    questionTwo(L1,k);
    
}
public static void questionTwo(LinkedList<Integer> L1, int k) {
	
	LinkedList<ArrayList<Integer>> L2 = new LinkedList<>();
	for (int i = 0; i <L1.size()-1; i++) {
		ArrayList<Integer> pair = new ArrayList<>();
			if (k == (L1.get(i)+L1.get(i+1))) {
				pair.add(L1.get(i));
				pair.add(L1.get(i+1));
				L2.add(pair);
			}
			
		}
	System.out.println(L2);
	}
	
}

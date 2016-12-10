package Session6;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> rollno = new HashSet<Integer>();
		rollno.add(11);
		rollno.add(12);
		rollno.add(13);
		rollno.add(14);
		rollno.add(15);
		
		Iterator<Integer> gel = rollno.iterator();
		while (gel.hasNext()) {
			Integer integer = gel.next();
			System.out.println("HashSet values: " +integer);
			
		}
		
		
		
	}

}

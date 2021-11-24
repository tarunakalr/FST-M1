package activities;

import java.util.HashSet;

public class activity10 {

	public static void main(String[] args) {
		
		HashSet<String>  hs= new HashSet<String>();
		
		hs.add("Red");
		hs.add("Blue");
		hs.add("Green");
		hs.add("Yellow");
		hs.add("Pink");
		hs.add("Black");
		
		System.out.println("Values of Hashset are" + hs);
		
		System.out.println("Size of list is " +hs.size());
		
		hs.remove("Black");
		hs.remove("Apple");
		
       System.out.println("Does list conatins Yellow ?" + hs.contains("Yellow"));
		
		System.out.println("Does list contains Black?" + hs.contains("Black"));
		
		System.out.println("Values of Hashset are" + hs);
		
		
		
		

	}

}

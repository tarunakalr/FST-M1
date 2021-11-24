package activities;

import java.util.ArrayList;
import java.util.List;

public class activity9 {

	public static void main(String[] args) {
		
		ArrayList<String> myList= new ArrayList<String>();
		
		myList.add("Red");
		myList.add("Blue");
		myList.add("Green");
		myList.add("Yellow");
		myList.add("Pink");
		
		for(String s:myList)
		{
			System.out.println(s);
		}
		
		System.out.println("Third element is:" + myList.get(3));
		System.out.println("Does list conatins Yellow ?" + myList.contains("Yellow"));
		
		System.out.println("Does list contains Black?" + myList.contains("Black"));
		
		System.out.println("Size of list is " +myList.size());
		
		myList.remove("Green");
		
		System.out.println("Size of list is " +myList.size());
		
		
		

		
		

	}

}

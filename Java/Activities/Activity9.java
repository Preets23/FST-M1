package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList= new ArrayList<String>();
		myList.add("Sam");
		myList.add("Jack");
		myList.add("Miller");
		myList.add("Steve");
		myList.add("Rick");
		System.out.println("List of names in my list "+myList);
		
		System.out.println("3rd name in the List "+myList.get(2));
		System.out.println("Number of names in the list "+myList.size());
		if(myList.contains("Steve")) {
			System.out.println("Steve is part of the List");
		}
		myList.remove("Rick");
		System.out.println("Updated List "+myList);
		}
	}



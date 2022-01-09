package activities;

import java.util.HashSet;

public class Activity10 {
	
	public static void main(String args[]) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Apple");
		hs.add("Orange");
		hs.add("Banana");
		hs.add("Strawberry");
		hs.add("Orange");
		hs.add("Papaya");
		
		System.out.println("Hash set contains : "+hs);
		System.out.println(hs.size());
		if(hs.contains("Orange")) {
			System.out.println("Hash set has Orange");
			hs.remove("Orange");
			System.out.println("Orange is removed");
		}
		if(hs.remove("Grapes")) {
			System.out.println("Grapes is from the set");
		}else {
			System.out.println("Grapes is not from the set");
		}
	
		System.out.println("Updated Hashset is "+hs);
	}

}

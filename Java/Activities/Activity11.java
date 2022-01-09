package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> MapValues=new HashMap<>();
		MapValues.put(1,"Blue");
		MapValues.put(2,"Green");
		MapValues.put(3,"Red");
		MapValues.put(4,"Violet");
		MapValues.put(5,"Pink");
		System.out.println("Map : "+MapValues);
		System.out.println("Keys : "+MapValues.keySet());
		System.out.println("Values : "+MapValues.values());
		System.out.println("Entries: "+MapValues.entrySet());
		if(MapValues.containsValue("Green")) {
			System.out.println("Green is part of Map");
		}
		String removevalue=MapValues.remove(3);
		System.out.println("Removed value: "+removevalue);
		System.out.println("Number of HashMap Pairs "+MapValues.size());
		System.out.println("Updated Map Pairs : "+MapValues);
	}
	}



package activities;

import java.util.Arrays;

public class Activity2 {
public static void main(String[] args) {
	int[] arr= {10, 77, 10, 54, -11, 10};
	int Sum=30;
	
	System.out.println("Array Value = " + Arrays.toString(arr));
	
	int temp=0;
	
	for(int number: arr)
	{
		System.out.println(number);
		if(number==10) {
	    temp=temp+number;
	    System.out.println("Current number value:" +temp);
		}
		
		if(temp>30) {
			break;
		}
		
	}
	System.out.println("Sum of 10's in array= "+temp);
	
		if(temp==Sum) {
			System.out.println("Value equal to 30: True");
			}
		
	}
	
}
	


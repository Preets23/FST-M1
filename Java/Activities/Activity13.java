package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Integers : ");
        ArrayList<Integer> list=new ArrayList<Integer>();
        Random indexGen = new Random();
        while(scan.hasNextInt()) {
        	list.add(scan.nextInt());
        }
        Integer nums[] = list.toArray(new Integer[0]);
        int index=indexGen.nextInt(nums.length);
        System.out.println("Value in array at generated index: " + nums[index]);
        System.out.println(index);
       
        scan.close();
	}
	
	
}

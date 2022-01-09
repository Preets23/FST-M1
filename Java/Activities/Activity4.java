package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {4, 3, 2, 10, 12, 1, 5, 6};
		System.out.println("Current Number Order: "+Arrays.toString(number));
		sort(number);
		System.out.println("Sorted Array:"+Arrays.toString(number));
	}

		static void sort(int arr[]) {
		int size=arr.length;
		int i,key;
		for(i=0;i<size;i++) {
			key=arr[i];
			System.out.println("current key value = "+key);
			int j=i-1;
			System.out.println("current j value = "+j);
			
			while(j>=0 && key<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j + 1]= key;
		}
		}
}
		
		
	

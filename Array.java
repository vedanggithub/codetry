//common elements from two arrays in a sorted form
import java.util.ArrayList;

import java.util.Collections;

public class Array {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		int arr1[] = { 4, 7, 3, 9, 2 };
		int[] arr2 = { 3, 2, 12, 9, 40, 32, 4 };
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					
				
					a.add(arr1[i]);
				}
			}
		}
		Collections.sort(a);
		System.out.println(a);
		
	}
}

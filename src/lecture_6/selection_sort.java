package lecture_6;

import java.util.*;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i < n;i++) {
			arr[i] = scn.nextInt();
		}
		
		selection_sort(arr);
        print(arr);
	}
	
	public static void selection_sort(int[] arr) {
		for(int i = 0;i < arr.length - 1;i++) {
			int minidx = i;
			for(int j = i+1; j < arr.length;j++) {
				if(isSmaller(arr,j,minidx) == true) {
				    minidx = j;
				}
			}
			
			swap(arr , i , minidx);
		}
	}
	
	public static boolean isSmaller(int[] arr,int i,int j) {
		if(arr[i] < arr[j]) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void print(int[] arr) {
		for(int i=0 ; i<arr.length;i++) {Z
			System.out.println(arr[i]);
		}
	}

}

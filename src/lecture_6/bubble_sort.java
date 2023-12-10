package lecture_6;
import java.util.*;
public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i < n;i++) {
			arr[i] = scn.nextInt();
		}
		
		bubble_sort(arr);
        print(arr);
	}
	
	public static void bubble_sort(int[] arr) {
		int n = arr.length;
		for(int itr = 1;itr <= n - 1;itr++) {
			for(int i = 0; i <= n - itr - 1;i++) {
				if(isSmaller(arr,i+1,i) == true) {
					swap(arr,i+1,i);
				}
			}
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
		for(int i=0 ; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

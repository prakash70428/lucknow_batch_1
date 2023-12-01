package lecture_6;
import java.util.*;
public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {10,20,5,7,8};
        int[] other = {100,200,300,400,600};
        System.out.println(arr[0] + " " + arr[1]);
        //Swap(arr[0] , arr[1]); No interchange
        //Swap1(arr,0,1); changes reflected 
        Swap2(arr , other);
        System.out.println(arr[0] + " " + arr[1]);
	}
    public static void Swap(int a ,int b) {
    	int temp = a;
    	a = b;
    	b = temp;
    }
    public static void Swap1(int[] arr,int i,int j) {
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
    public static void Swap2(int[] arr,int[] other) {
    	int[] temp = arr;
    	arr = other;
    	other = temp;
    }
}
 
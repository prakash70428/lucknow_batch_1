package lecture_6;
import java.util.*;
public class linear_search {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0 ;i < n1;i++) {
        	arr1[i] = scn.nextInt();
        }
        
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0 ;i < n2;i++) {
        	arr2[i] = scn.nextInt();
        }
        
        int sz = Math.max(n1,n2) + 1;
        int[] ans = new int[sz];
        
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = ans.length - 1;
        int carry = 0;
        
        while(k >= 0) {
        	int sum = carry;
        	if(i >= 0) {
        		sum += arr1[i];
        	}
        	if(j >= 0) {
        		sum += arr2[j];
        	}
        	
        	if(sum < 10) {
        		carry = 0;
        	}else {
        		carry = 1;
        		sum -= 10;
        	}
        	ans[k] = sum;
        	
        	i--;
        	j--;
        	k--;
        }
        
        for(int p = 0 ;p < ans.length;p++) {
        	System.out.println(ans[p]);
        }
        
	}
}
 
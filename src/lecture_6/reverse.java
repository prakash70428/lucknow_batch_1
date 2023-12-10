package lecture_6;
import java.util.*;
public class reverse {
	public static void main(String[] args) {
	   Scanner scn = new Scanner(System.in);
	   int b = scn.nextInt();
	   int n1 = scn.nextInt();
	   int n2 = scn.nextInt();
	   
	   int d = getProduct(n1,n2,b);
	   System.out.println(d);
	}
	public static int getProduct(int n1,int n2,int b) {
		  int ans = 0;
		  int power = 1;
		  
		  while(n2 != 0){
			  int l2 = n2 % 10;
			  n2 /= 10;
			  
			  int pwsd = gpwsd(n1,l2,b);
			  
			  //ans += (pwsd * power);
			  ans = aba(ans,pwsd * power,b);
			  power *= 10;
		  }
		  
		  return ans;
	}
	//n2 is a single digit number
	public static int gpwsd(int n1,int n2,int b) {
		int ans = 0;
		int power = 1;
		int carry = 0;
		
		while(n1 != 0 || carry != 0) {
			int l1 = n1 % 10;
			n1 /= 10;
			
			int product = l1 * n2 + carry;
			int q = product / b;
			int r = product % b;
			
			ans += (r * power);
			carry = q;
			power *= 10;
		}
		
		return ans;
	}
	public static int aba(int n1,int n2,int b) {
		int ans = 0;
		int power = 1;
		int carry = 0;
		
		while(n1 != 0 || n2 != 0 || carry != 0) {
			int l1 = n1 % 10;
			int l2 = n2 % 10;
			n1 /= 10;
			n2 /= 10;
			
			int sum = l1 + l2 + carry;
			int q = sum / b;
			int r = sum % b;
			
			ans += (r * power);
			carry = q;
			power *= 10;
		}
		
		return ans;
	}
}

package Pattern;
import java.util.Scanner;


public class palindrome {

	public static void main(String[] args) {
		int r,s=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
		
         int t=n;
         while(n>0)
        	 {
        	   r=n%10;
        	   n=n/10;
        	   s=s*10+r;
        	 
        	 
        	 }
         if(t==s)
         {
        	 System.out.println("palindrome");
        	 
         }
         else
         {
        	 System.out.println("not");
         }
        	 
	}

}

package Pattern;
import java.util.Scanner;
public class armstrong_no {

	public static void main(String[] args) {
		int n=153;
		int r;
		int temp = n;
		int sum=0;
		while (temp>0)
		{
			r=temp%10;
			temp=temp/10;
			sum =sum+r*r*r;
			
		}
		if(n==sum)
		{
			System.out.println("amstrong no");
		}
		else System.out.println("not");

	}

}

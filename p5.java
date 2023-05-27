package Pattern;
import java.util.Scanner;
public class p5 {

	public static void main(String[] args) {
		int i;
		for( i=1;i<=5;i++)
		{ 
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		for(int l=2
				;l<=5;l++)
		{
		for(int k=l+1;k<=6;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
	}

}

package Pattern;
import java.util.Scanner;
public class p6 {

	public static void main(String[] args) {
		int i;
		for( i=5;i>=1;i--)
		{
			for(int j=1;j<=5-i;j++)
			{System.out.print(" ");}
            
			for (int k=1;k<=2*i-1;k++)
           
			{
            	System.out.print("*");
            	
            }
            System.out.println();
		}
		for( i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{System.out.print(" ");}
            
			for (int k=1;k<=2*i-1;k++)
           
			{
            	System.out.print("*");
            	
            }
            System.out.println();
		}

	}

}

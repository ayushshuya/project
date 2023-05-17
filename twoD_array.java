package Pattern;
import java.util.Scanner;
public class twoD_array {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		 int b[][]=new int[2][2];
		 int c[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				 a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				 b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				 System.out.print(a[i][j]+ " " );
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(b[i][j]+ " " );
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
		
			}
		}	
		
		

	}

}

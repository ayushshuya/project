package Pattern;
import java.util.Scanner;

public class num {

	public static void main(String[] args) {
		
		for ( int i=1;i<=4;i++)
		{
			for ( int j=1;j<=4;j++)
				
				{
				int k=j+i-1 ;

				if (k>=5)
				{
					System.out.print((k-4) + " ");
				}	
				else
				{
				System.out.print(k + " ");
				}
				}
			System.out.println();
		}

	}
	}


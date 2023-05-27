package Pattern;
import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		
		
		
		
		
		for(int i=1;i<=3;i++)
		{
			for(int l=1;l<=3-i;l++)
			{
				System.out.print(" ");
			}
			int k=0;
			for( int j=1;j<=2*i-1;j++)
			{
				
				if(j<=i)
				
				{
					k=k+1;
				}
				else
			    {
			    	k=k-1;
			    }
			
		    
				System.out.print(k);
				
		    }
			System.out.println();
		
			
		}

	}

}

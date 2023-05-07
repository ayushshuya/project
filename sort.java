package Pattern;
import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n; 
		n=sc.nextInt();
		int a[]=new int [n];
		
		int temp;
		
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
				{
				if (a[i]>a[j])
			      {
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			      }	
				}
		}
		int count=0;
for(int j=0;j<n;j++)
{
		for (int i=j;i<n;i++)
		{
        if(a[j]==a[i])
        {
        	j=i;
        	count++;
        
        	
        }
		}
		System.out.println(a[j]+ " = "+count);
		count=0;
		}
	}		

}

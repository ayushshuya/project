package Pattern;
import java.util.Scanner;

public class array_summ {

	public static void main(String[] args) {
		int a[] = new int [5];
		int sum=0;
		double avg;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter elements of array");
	    for (int i=0;i<5;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    for (int i=0;i<5;i++)
	    {
	    	System.out.print(a[i]+ " ");
	    }
         for(int i=0;i<5;i++)
         {
        	 sum=a[i]+sum;
        	 
         }
         avg=sum/5.0;
         System.out.println(" \n sum is " +sum+ " \n average is " +avg);
         
        	 
	}

}

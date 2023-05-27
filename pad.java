package Pattern;
import java.util.Scanner;

public class pad {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0,i;
System.out.println("enter lower");
int a=sc.nextInt();

System.out.println("enster upper");
int b=sc.nextInt();
for(  i=a;i<=b;i++)
{ 
	for(int j=2;j<i;j++)
		
	{
		if(i%j==0)
	{
		count++;
	}
		
	
    }

	if(count==0)
	{
		System.out.println(i);
	}
count=0;

}
	}

}

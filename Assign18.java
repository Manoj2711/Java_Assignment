import java.util.*;
class Prime{
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int count=0;
		for(int j=1;j<n/2;j++)
		{ 
		  
		  if(n%j==0)
		  {
			count++;
		  }
		} 
		if(count==1)
		 {
		   System.out.println(n+ " is Prime no");
		 }
		else
		 {
			System.out.println(n+ " is Not Prime no");
		 }
		
		
    }

}
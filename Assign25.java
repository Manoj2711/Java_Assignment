import java.util.*;
class ArrayEvenodd{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of array");
   int n=sc.nextInt();
   int arr[]=new int[n];
   System.out.println("Enter the elements of array");
   int odd=0;
   int even=0;
   for(int i=0;i<arr.length;i++)
   {
     arr[i]=sc.nextInt();
   }
   
   for(int i=0;i<arr.length;i++)
   {
	   if(arr[i]%2==0)
	   {
		   even=even+arr[i];
	   }
	   else
	   {
		   odd=odd+arr[i];
	   } 
   }
   System.out.println("Sum of the Even Element: "+even);
   System.out.println("Odd of the Odd Element: "+odd);

}

}
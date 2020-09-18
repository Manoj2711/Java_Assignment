import java.util.*;
class ArraySearch{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of array");
   int n=sc.nextInt();
   int arr[]=new int[n];
     System.out.println("Enter the elements of array");
   for(int i=0;i<arr.length;i++)
   {
     arr[i]=sc.nextInt();
   }
   System.out.println("Enter the array element for search");
   int num=sc.nextInt();
   int flag=0;
   for(int i=0;i<arr.length;i++)
   {
			if(arr[i]==num)
			{
	         flag=1;			
     		System.out.println("The number "+num+" is found at a index location "+i);
			break;
			}
			
			
   }
   if(flag==0)
   {
	   System.out.println("Number is not found");
   }
	
 }

}
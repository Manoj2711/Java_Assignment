import java.util.*;
class Arraysort{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of array");
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<arr.length;i++)
   {
     arr[i]=sc.nextInt();
   }
   for(int i=0;i<arr.length;i++)
   {
		for(int j=0;j<n-1-i;j++)
		{
			if(arr[j]<arr[j+1])
			{
			  int temp=arr[j];
			  arr[j]=arr[j+1];
			  arr[j+1]=temp;
			}
		 
		}
    
   }
   for(int k:arr)
    {
     System.out.println(k);
    }
  
}

}
import java.util.*;
class Average{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of array");
   int n=sc.nextInt();
   int arr[]=new int[n];
   float total=0;
   for(int i=0;i<arr.length;i++)
   {
      arr[i]=sc.nextInt();
   }
   
   for(int j=0;j<n;j++)
   {
      total=total+arr[j];
   }
   System.out.println("Average of : "+n+ " Element is="+total/n);
 }

}
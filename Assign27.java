import java.util.*;
class ArrayMaxMin{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the array elements");
			arr[i]=sc.nextInt();
		
		}
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>=max)
			{
				max=arr[i];
			}
			if(arr[i]<=min)
			{
				min=arr[i];
			}
		
		}
		
		System.out.println("MAX ELEMENT IS: "+max);
		System.out.println("MIN ELEMENT IS: "+min);
		
	
	}


}
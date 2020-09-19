import java.util.*;
class Arraycount{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of row");
		int rows=sc.nextInt();
		int arr[][]=new int[rows][];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the cols for the row");
			int cols=sc.nextInt();
			arr[i]=new int[cols];
			for(int j=0;j<arr[i].length;j++){
			 System.out.println("Enter the elements");
			 arr[i][j]=sc.nextInt();
			 
			 if((i+j)%2==0 && i==j)
			 {
				 sum=sum+arr[i][j];
			 }
				
			}
			
		}
		
		System.out.println("sum of the diagonal elements of 2D array= "+sum);
		
	}

}
import java.util.*;
class Arraycount{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of row");
		int rows=sc.nextInt();
		int arr[][]=new int[rows][];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the cols for the row");
			int cols=sc.nextInt();
			arr[i]=new int[cols];
			for(int j=0;j<arr[i].length;j++){
			 System.out.println("Enter the col "+j+ "elements");
			 arr[i][j]=sc.nextInt();		
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr[i].length;j++)
			{
				count++;
				
			}
			System.out.println("Total no elements in " +i+ " 1-D elements= "+count);
		}
		System.out.println("Total no of 2-D elements= "+rows);
		
	}

}
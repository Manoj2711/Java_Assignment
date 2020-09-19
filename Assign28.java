import java.util.*;
class ArrayString{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of String array");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the string array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		
		}
		
		for(String s:arr){
		    
			System.out.println(s);
		}
	
	}


}
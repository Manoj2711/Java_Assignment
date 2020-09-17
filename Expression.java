import java.util.*;
class Expression{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int x=sc.nextInt();
		int y=((x*x)+3*x-7);
		System.out.println(y);
		y=x++ + ++x;
		
		System.out.println(x);
		System.out.println(y);

	   int z = x++ - --y - --x  +  x++;
	   System.out.println("X:"+x+"Y :"+y+ "Z: "+z);
	
	}
}
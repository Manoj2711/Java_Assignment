import java.util.*;
class Reverse{

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers");
	int num=sc.nextInt();
	int reverse=0;
	while(num!=0){
		
      reverse = reverse * 10;
      reverse = reverse + num%10;
      num = num/10;
	}
	System.out.println("Reverse no is: " +reverse);
	
	
	
	}
}
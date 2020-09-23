import java.util.*;
class MathOperation {

       private double radius;
	   private double area;
	   
	   public static int sum(int num1,int num2){
			return num1+num2;
	   }
		
		public static int sub(int num1,int num2){
			return num1-num2;
	   }
	
		public static int mul(int num1,int num2){
			return num1*num2;
	   }
	   
	   	public static int power(int num1,int num2){
			int power=1;
			for(int i=0;i<num2;i++)
			{
				power=power*num1;
			}
			
			return power;
			
	   }

		
	 
	   
}
class Demo{
		public static void main(String[] args)
		{	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers");
			
			int num1=sc.nextInt();
			int num2=sc.nextInt();

			int result=MathOperation.sum(num1,num2);
			System.out.println("Sum is= "+result);
			
			result=MathOperation.sub(num1,num2);
			System.out.println("Sub is= "+result);
			
			result=MathOperation.mul(num1,num2);
			System.out.println("Mul is= "+result);
			
			result=MathOperation.power(num1,num2);
			System.out.println("Power is= "+result);
			
			
		}

}
import java.util.*;
class MathOperation {

      public static void multiply(int num1,int num2){
		  
		  System.out.println("MUL= "+(num1*num2));
	  }
	  
	  public static void multiply(float num1,float num2,float num3){
		  
		  System.out.println("MUL= "+(num1*num2*num3));
	  }
	  
	  public static void multiply(double num1,int num2){
		  
		  System.out.println("MUL= "+(num1*num2));
	  }
		
	  public static void multiply(int arr[]){
		  int result=1;
		  for(int i=0; i<arr.length;i++)
		  {
			  
			  result=result*arr[i];
		  
		  }
		   System.out.println("MUL= "+result);
	  }
			
	 
	   
}
class Demo{
		public static void main(String[] args)
		{	
			MathOperation.multiply(5,7);
			MathOperation.multiply(5.0f,7.5f,5.5f);
			MathOperation.multiply(5.0,7);
			int arr[]=new int[] {1,2,3,4,5};
			MathOperation.multiply(arr);			
			
		}

}
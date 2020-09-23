import java.util.*;
class Circle{

       private double radius;
	   private double area;
	   
   
	   public void init(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Radius of circle");
			radius=sc.nextDouble();
	   }
	   
	   public double calculateArea(){
		   
		   return 3.14*radius*radius;
	   }
	   
	   public void display(){
			System.out.println("Radius of circle= "+radius);
		   System.out.println("Area of circle= "+calculateArea());
	   }
	   
	   
}
class CircleDemo{
		public static void main(String[] args)
		{	
			Circle c=new Circle();
			c.init();
			c.display();
			
			
			
			
		}

}
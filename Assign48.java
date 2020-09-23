import java.util.*;
abstract class Processor{
	double data;

	void showdata(){
			System.out.println(data);
	}
	
	abstract void process();
}
class factorial extends Processor{

		int n;
		factorial(int n){
			this.n=n;
			
		}
		
		void process(){
			
			int sum=1;
			for(int i=1;i<=n;i++){
				sum=sum*i;
			}
			data=sum;
		}
}
class circle extends Processor{
	double r;
	circle(double r){
		this.r=r;
	}
	void process(){
		double area;
		area=3.14 * r *r;
		data=area;
	}

}

class ProcessorDemo{
	public static void main(String args[]){
			 Scanner sc=new Scanner(System.in);
			 int ch;
			 
			 do{
				  System.out.println("Enter the choice 1.Factorial 2.Area 3.Exit");
				  ch=sc.nextInt();
				  
				  switch(ch){
					case 1: 
							 System.out.println("Enter the number for calculate Factorial:");
							 int n=sc.nextInt();
							 Processor p=new factorial(n);
							 p.process();
							 p.showdata();
							 break;
					case 2: 
							 System.out.println("Enter the radius of circle:");
							 double r=sc.nextDouble();
							 Processor p1=new circle(r);
							 p1.process();
							 p1.showdata();
							 break;
					case 3:
							break;
					default:
							break;
							
				  }
				  
			 }
			 while(ch!=3);
			 
			 			 
}
}
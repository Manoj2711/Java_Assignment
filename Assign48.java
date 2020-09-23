import java.util.*;
abstract class Processor{
	double data;

	void showdata(){
			System.out.println(data);
	}
	
	abstract void process();
}
class factorial extends Processor{

		void process(){
			int n=5;
			int sum=1;
			for(int i=1;i<=n;i++){
				sum=sum*i;
			}
			data=sum;
		}
}
class circle extends Processor{
	void process(){
		int r=5;
		double area;
		area=3.14 * r *r;
		data=area;
	}

}

class ProcessorDemo{
	public static void main(String args[]){
			Processor p=new factorial();
			Processor p1=new circle();
			p.process();
			p1.process();
			p.showdata();
			p1.showdata();
	}

}
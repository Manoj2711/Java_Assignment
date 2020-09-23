import java.util.*;
interface taxable{
	 double salesTax=0.07;
	 double incomeTax=0.10;
	 
	 void calTax();
	
}

class Employee implements taxable{
	int empid;
	int salary;
	String name;
	
	Employee(){}
	
	Employee(int empid,int salary,String name){
		this.empid=empid;
		this.salary=salary;
		this.name=name;
	}
	
	public void calTax(){
		double incomeTax1=salary*incomeTax;
		System.out.println("Total IncomeTax= "+incomeTax1);
	}
}

class Product implements taxable{
	int pid;
	int price;
	int quantity;
	
	Product(){}
	
	Product(int pid,int price,int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	public void calTax(){
		double salesTax1=(price*quantity) * salesTax;
		System.out.println("Total IncomeTax= "+salesTax1);
	}
}


class Demo{
	public static void main(String args[]){
		taxable t=new Employee(1,15000,"jack");
		taxable t1=new Product(1,400,5);
		t.calTax();
		t1.calTax();
	}

}
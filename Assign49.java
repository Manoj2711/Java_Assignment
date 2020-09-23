interface Taxable{
  public final static double salesTax=0.07;
  public final static double incomeTax=0.105;
  void calcTax();
  
}

class Employee implements Taxable{
      int empId;
	  String name;
	  double salary;
      Employee(int empId,String name,double salary){
	       this.empId=empId;
		   this.name=name;
		   this.salary=salary;
	  }
	  
	  public void calcTax(){
	      double tax=salary*incomeTax;
		  System.out.println("tax="+tax);
	  }
}

class Product implements Taxable{
    int pid;
	double price;
	int quantity;
    Product(int pid,double price,int quantity){
	    this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	public void calcTax(){
	      double tax=price*quantity*salesTax;
		  System.out.println("tax="+salesTax);
		  System.out.println("tax="+tax);
	  }
}

class Demo{
    public static void main(String[] args){
	       Employee e=new Employee(1,"mehul",20000);
		   e.calcTax();
		   Product p=new Product(1,25000,2);
		   p.calcTax();
	}
}
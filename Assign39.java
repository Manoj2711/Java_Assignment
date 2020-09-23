import java.util.*;
class Product{
    private int pid;
	private float price;
	private int quantity;
	
	Product(){
		
	}
	Product(int pid,float price,int quantity){
	    this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	 public static void highestProduct(Product arr[]){
	         float max=0;
			 Product p=new Product();
	         for(int i=0;i<arr.length;i++)
			  {
			     if(arr[i].price>max)
				  {
				    max=arr[i].price;
				    p=arr[i];
				  }
				  
			  }
			 
			  System.out.println("product with highest product id="+p.pid);   
			
	  }
	  
	 public static double TotalProduct(Product pr[]){
	         double Total=0;
	         for(int i=0;i<pr.length;i++)
			  {
			     Total=Total+(pr[i].price*pr[i].quantity);
			  }
			  return Total;
	  }
	
	
}

class ProductDemo{
    public static void main(String[] args){
	    Product arr[]=new Product[5];
		Scanner sc=new Scanner(System.in);
		int max=0;
		for(int i=0;i<5;i++)
		{
		   System.out.println("enter the pid");
		   int pid=sc.nextInt();
		   System.out.println("enter the price of product");
		   float price=sc.nextFloat();
		   System.out.println("enter the quantity of product");
		   int quantity=sc.nextInt();
		   Product p=new Product(pid,price,quantity);
		   arr[i]=p;
		   
		}
		
		
		Product.highestProduct(arr);
		
		
		double Total=Product.TotalProduct(arr);
		System.out.println("total price="+Total);
		
		
	}
}
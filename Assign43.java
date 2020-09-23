import java.util.*;
class OneBHK{
		private double roomArea;
		private double hallArea;
		public double price;
		
		OneBHK(){
			
			roomArea=10;
			hallArea=20;
			price=450.0;
			
		}
		OneBHK(double roomArea,double hallArea,double price){
					this.roomArea=roomArea;
					this.hallArea=hallArea;
					this.price=price;
		}
		void show(){
			System.out.println(roomArea+" "+hallArea+" "+price);
		}
		
	
}
class TwoBHK extends OneBHK{
	
	private double roomArea2;
	
	TwoBHK(){
		super();
		roomArea2=500;
	}
	
	TwoBHK(double roomArea,double hallArea,double price,double roomArea2)
	{
		super(roomArea,hallArea,price);
		this.roomArea2=roomArea2;
	}
	
	void show(){
		super.show();
		System.out.println(roomArea2);
	}


}
/*

class Demo1{
	
	public static void main(String args[]){
		
		TwoBHK t=new TwoBHK(11,30,4500,60);
		t.show();
	}
}

*/

class FlatDemo {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        TwoBHK arr[] = new TwoBHK[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter roomarea");
            double roomArea = e.nextDouble();
            System.out.println("Enter hallarea");
            double hallArea = e.nextDouble();
            System.out.println("Enter price");
            double price = e.nextDouble();
            System.out.println("Enter room2area");
            double roomArea2 = e.nextDouble();
            TwoBHK bk = new TwoBHK(roomArea, hallArea, price, roomArea2);
            arr[i] = bk;
            // bk.show();

        }
	
        double sum = 0;
        // System.out.println("total price of three flats="+sum)
        for (TwoBHK abc : arr) {

            sum = sum + abc.price;
            abc.show();

        }
        System.out.println("Total of all flats=" + sum);
		
    }
}


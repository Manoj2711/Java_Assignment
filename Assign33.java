import java.util.*;
class Employee{

       private int empId;
	   private String empName;
   
	   void setData(int empId,String empName){
	    
		System.out.println("this "+this);
			this.empId=empId;
			this.empName=empName;
	   }
	   void showData()
	   {
			System.out.println(empId+" "+empName);
	   }
}
class EmployeeDemo{
		public static void main(String[] args)
		{
			Employee e=new Employee();
	       e.setData(1,"Manoj");
			e.showData();
			Employee e1=new Employee();
			e1.setData(2,"Mehul");
			e1.showData();
		}

}
import java.util.*;
class Employee{
	private  int empNo;
	private double salary;
	private static double Totsalary;
	private static int count;
	
	Employee(double salary){
		this.count++;
		this.empNo=count;
		this.salary=salary;
	}
	
	public static void countEmployee(){
		System.out.println("Total no of Employee= "+count);
	}
	
	public static void totalSalary(Employee arr[]){
		for(int i=0;i<arr.length;i++){
			Totsalary=Totsalary+arr[i].salary;
		}
		System.out.println("Total= "+Totsalary);
	}
	
	
}

class EmployeeDemo{

	
	public static void main(String[] args){
		
		Employee arr[]=new Employee[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.println("Enter the Salary");
			double salary=sc.nextDouble();
			Employee e=new Employee(salary);
			arr[i]=e;
		}
		
		Employee.countEmployee();
		Employee.totalSalary(arr);
	}
}
class Employee{
	private int empId;
	private String empName;
	
	Employee(){
		this(100,"Manoj");
		
	}
	
	Employee(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
	
	public void show(){
		System.out.println(empId+" "+empName);
	}

}
class EmployeeDemo1{
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.show();
	
	}
	

}
class Person{
	void getDetails(){
		System.out.println("persoon details");
		
	}
	void getjob(){
		System.out.println("persoon job");
		
	}
	
}

class Employee extends Person{
	 void getjob(){
		System.out.println("Employye job");
		
	}
	
	 void getDepartment(){
		System.out.println("Department job");
		
	}
	
}

class SuperDemo2{
	
	public static void main(String[] args){
		  Person ar[]={new Employee(),new Person()};
		  
		   for(Person p:ar)
		  {
			if(p instanceof Employee){
				
				System.out.println("Manoj");
				Employee e=(Employee)p;
				e.getDepartment();
			}  
		    else{
				 System.out.println("Mehul");	
				// Person p1=new Employee();//we not need to create new object bz object is allready created
				 p.getjob();
				 p.getDetails();		
			}
		  }
		  
		  
		
	}
}
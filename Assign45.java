import java.util.*;
class Student{
     int rollNo;
	double percentage;
	
	
	Student(){
	
	}
	
	Student(int rollNo,double percentage){
	      this.rollNo=rollNo;
		  this.percentage=percentage;
	}
	
	public void show(){
	    System.out.println("Rollno="+rollNo+" "+"percentage="+percentage);
	}
}

class CollegeStudent extends Student{
      int semester;
	  
	  CollegeStudent(){
	  
	  }
	  CollegeStudent(int rollNo,double percentage,int semester){
	                super(rollNo,percentage);
					this.semester=semester;
	  }
	  
	  public void show(){
	  super.show();
	    System.out.println("semester="+semester);
	}
	  

}

class SchoolStudent extends Student{
      private String className;
	  
	  SchoolStudent(){
	  
	  }
	  SchoolStudent(int rollNo,double percentage,String className){
	         super(rollNo,percentage);
             this.className=className;			 
	  }
	  
	  public void show(){
	     super.show();
	    System.out.println("className="+className);
	}
	  

}

class Demo{
     public static void main(String[] args){
	     Student c[]={new CollegeStudent(),new CollegeStudent(),new SchoolStudent(),new SchoolStudent(),new SchoolStudent()};
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<c.length;i++){
		     if( c[i] instanceof CollegeStudent)
			   {
			      System.out.println("rollno");
				  int rollNo=sc.nextInt();
				  System.out.println("percentage");
				  Double percentage=sc.nextDouble();
				  System.out.println("semester");
				  int semester=sc.nextInt();
				   c[i]=new CollegeStudent(rollNo,percentage,semester);
				  
			   }
			   else{
			         System.out.println("rollno");
				  int rollNo=sc.nextInt();
				  System.out.println("percentage");
				  Double percentage=sc.nextDouble();
				  System.out.println("classname");
				  String className=sc.next();
				  //c[i]=new SchoolStudent(rollNo,percentage,className);
				  Student s=new SchoolStudent(rollNo,percentage,className);
				  c[i]=s;
				  
			   }
		 }
		 for(Student s:c)
		 {
			  s.show();
			 
		 }
		 
		 System.out.println("enter the Rollno. you want to search");
		 int num=sc.nextInt();
		 int Count=0;
		 for(int i=0;i<c.length;i++)
		 {
		    if(c[i].rollNo==num)
			{
				System.out.println("rollno. found");
				if(c[i] instanceof SchoolStudent)
				{
					System.out.println("this is school student");
				}
				else{
					
					System.out.println("this is college student");
				}
			}
			if(c[i].percentage>75)
			{
				Count++;
			}
		 }
		  System.out.println("Count of std having A grade: " + Count);
	 }

}
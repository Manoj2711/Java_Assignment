import java.util.*;
class Student{

       private int Rno;
	   private String Name;
   
	   void setData(int rno,String name){
	    
			Rno=rno;
			Name=name;
	   }
	   
	   void showData()
	   {
			System.out.println(Rno+" "+Name);
	   }
}
class StudentDemo{
		public static void main(String[] args)
		{
			Student s=new Student();
			s.setData(1,"Manoj");
			s.showData();
		}

}
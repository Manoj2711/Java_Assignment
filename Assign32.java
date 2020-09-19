import java.util.*;
class Student{

       private int Rno;
	   private String Name;
	   private static int count;
   
	   void setData(int rno,String name,int c){
	    
			Rno=rno;
			Name=name;
			count=c;
	   }
	   
	   void showData()
	   {
			System.out.println(Rno+" "+Name);
			System.out.println("NO of Object Created using Student Class: "+count);
	   }
}
class StudentDemo{
		public static void main(String[] args)
		{
			Student s=new Student();
			s.setData(1,"Manoj",1);
			s.showData();
			Student s1=new Student();
			s1.setData(1,"Mehul",2);
			s1.showData();
			s.showData();
		}

}
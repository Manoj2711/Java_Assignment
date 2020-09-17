import java.util.*;
class Marrige{
 public static void main(String args[])
 {

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter your gender M/F ");
  char gender=sc.next().charAt(0);
  System.out.println("Enter your Age ");
  int age=sc.nextInt();
  if(gender=='m' && age>21)
  {
	System.out.println("Men Eligible for marrage");

  }
  else if(gender=='f' && age>18)
	{
      System.out.println("Women is eligible for marrage");
	}
    else
	{
     System.out.println("Women is eligible for marrage");
    }

 }

}
import java.util.*;
class Swap{
 public static void main(String args[])
 {

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the two no ");
  int num1=sc.nextInt();
  int num2=sc.nextInt();

   int temp=num1;
   num1=num2;
   num2=temp;

  System.out.println("num1: "+num1);
  System.out.println("num1: "+num2);

 }

}
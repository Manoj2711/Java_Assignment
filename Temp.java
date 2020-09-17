import java.util.*;
class Temp{
 public static void main(String args[])
 {

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the temp in Farenhite");
  int temp=sc.nextInt();
	
  int tempInCelcius=5*(temp-32)/9;
  System.out.println("Temp in Celcius :"+tempInCelcius);

 }

}
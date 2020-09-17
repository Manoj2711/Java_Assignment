import java.util.Scanner;
class Percentage{
 public static void main(String args[])
 {
  int total=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the maks of subject");
  for(int i=0;i<5;i++){
	int marks=sc.nextInt();
	total=total+marks;
  }
  
  System.out.println("Sum Of Sub= " +total);
  System.out.println("Percentage= " +(total/5));
 }

}
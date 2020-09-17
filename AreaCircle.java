import java.util.Scanner;
class AreaCircle{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter The Radius of Circle:");
  Float r=sc.nextFloat();
  System.out.println("Area Of Circle: " +(3.14*r*r));
  System.out.println("Perimeter Of Circle: " +(2*3.14*r));
 }

}
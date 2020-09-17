import java.util.*;
class Year
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of days:");
        int days = sc.nextInt();
		int year=0;
		int month=0;
		int rem=0;
		if(days==365)
		{
				year=1;
		}
		
		else if(days>365)
		{
			year=days/365;
		   int remDays=days-365;
			month=remDays/30;
			rem=remDays%30;
			
		}
		else{
			month=days/30;
			rem=days%30;
		}
		System.out.print("Year: "+year+"month: "+month+ "days: "+rem);
    }
}
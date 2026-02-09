import java.util.Scanner;
class leapyearange
{
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the year:");
		int a=sc.nextInt();
			if((a%400==0 || a%4==0 && a%100!=0))
			{
				System.out.println("Is Leap year");
			}
			else
			{
				System.out.println("Not a Leap year..");
			}
	}
}

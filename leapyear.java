import java.util.Scanner;
class leapyear
{
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter starting year:");
		int start=sc.nextInt();
		System.out.print("Enter ending year:");
		int end=sc.nextInt();
		System.out.println("Leap years are:");
		for(int y=start;y<=end;y++)
		{
			if((y%400==0 || y%4==0 && y%100!=0))
			{
				System.out.println(y);
			}
		}
	}
}

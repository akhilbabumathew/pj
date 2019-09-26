package birthday;

	import java.util.Scanner;

	public class Leapyear {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int yr;
	System.out.println("Enter a year");
	Scanner sc=new Scanner(System.in);
	yr=sc.nextInt();
	if((yr%400==0)||(yr%4==0)&&(yr%100!=0))
	{
	System.out.println("It is a leap year");
	}
	else
	{
	System.out.println("It is not a leap year");
	}
	}

	}



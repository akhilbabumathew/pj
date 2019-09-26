package amstrong;

import java.util.Scanner;
import java.math.*;
public class Armstrong {
	
	public static void main(String[] args ) {
		double sum=0;
		int no,count=0,rem;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		no=s.nextInt();
		int temp=no;
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			count++;
		}
		no= temp;
		while(no!=0)
		{
			rem=no%10;
			sum=sum+Math.pow(rem, count);
			no=no/10;
		}
		if(sum==temp)
		{
System.out.println("The given no is Amstrong");
}
		else
		{
			System.out.println("The given no is not an Amstong");
		}
}}
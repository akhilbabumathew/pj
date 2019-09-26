package mathemathics;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String [] args) {
int n,f=0,i,a=0,b=1;
Scanner hs=new Scanner(System.in);
System.out.println("Enter a number");
n=hs.nextInt();
System.out.print("The fibonacci series is "+a+" "+b+" ");
for(i=1;i<=n;i++)
{
	f=a+b;
	a=b;
	b=f;
	System.out.print(f+" ");
}
}
}

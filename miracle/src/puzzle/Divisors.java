package puzzle;
import java.util.Scanner;
public class Divisors {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n,i,sum=0;
	System.out.println("Enter a number");
	n=sc.nextInt();
	System.out.print("The divisors of the number are");
	for(i=1;i<n;i++) {
		if(n%i==0) {
			System.out.print(" "+i);
			sum=sum+i;	
		}
	}
	System.out.println("\nThe sum of divisors are "+sum);	
	if(sum==n) {
		System.out.println("It is a perfect number");
	}
	else {
		System.out.println("It is not a perfect number");
}	
}
}

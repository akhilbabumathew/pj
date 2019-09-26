package ncr;
import java.util.Scanner;
public class Main {
public static void main(String[]args) {
	int n,r,i;
	long ncr,a=1,b=1,c=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the of n");
	n=sc.nextInt();
	System.out.println("Enter the of r");
	r=sc.nextInt();
	for(i=1;i<=n;i++) {
		a=a*i;
	}
	for(i=1;i<=r;i++) {
		b=b*i;
	}
	for(i=1;i<=n-r;i++) {
		c=c*i;
	}
      ncr=a/(b*c);
      System.out.println("The NCR factor for given values is "+ncr);
	
}
}

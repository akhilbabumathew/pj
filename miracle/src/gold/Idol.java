package gold;
import java.util.Scanner;
public class Idol {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n,sum=0;
	System.out.println("Enter the kgs of gold");
	n=sc.nextInt();
	sum=n;
	while(n>=5) {
		n=n/5;
		sum=sum+n;
	}
		System.out.println("Number of sculptors can be made is "+sum);
	}

}

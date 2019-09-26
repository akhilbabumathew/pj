package combo;

import java.util.Scanner;

public class Task {
	public static void main(String[]args) {
		int n,i,f=1;
		System.out.println("Enter the number of alphabets in your name");
		Scanner hs=new Scanner(System.in);
		n=hs.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("The number of combination"+f);
}
}
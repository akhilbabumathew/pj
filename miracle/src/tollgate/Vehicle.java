package tollgate;
import java.util.Scanner;
public class Vehicle {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n,count1=0,count2=0,i;
	System.out.println("Enter the number of vehicles");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the fare collected for each vehicles ");
	for( i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++) {
		if(a[i]>50) {
			count1++;
			
		}
		else if(a[i]<50 && a[i]!=0) {
			count2++;
		}
			
	}
	
	System.out.println("Number of heavy vehicles "+count1+" and the number of light weight vehicles is "+count2);
}
}

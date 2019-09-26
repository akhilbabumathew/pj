package result;
import java.util.Scanner;
public class Average {
public static void main(String[]args) {
	int num,i,sum=0,av;
	int[]arr;
	System.out.println("Enter the number of students");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	arr=new int[num];
	System.out.println("Enter the marks of students");
	for(i=0;i<num;i++)
	{
	arr[i]=(int) sc.nextInt();
	}
	for(i=0;i<num;i++)
	{
		sum=sum+arr[i];
	}
	av=sum/num;
	System.out.println("the average is "+av);
}
}

package winning;
import java.util.Scanner;

	public class Bid {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int num;
	int arr[];

	System.out.println("Enter the number of applications");
	num=sc.nextInt();
	arr=new int[num];
	System.out.println("Enter the amount(in crores)");
	for(int i=0;i<num;i++)
	{
	arr[i]=sc.nextInt();
	}
	int temp=arr[0];
	for(int i=1;i<num;i++)
	{
	if(temp<arr[i])
	{
	temp=arr[i];
	}
	}
	System.out.println("The winning bid is "+temp+" crores");
	}

	}


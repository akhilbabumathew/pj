package examination;

import java.util.Scanner;

public class Mark {
	public static void main(String[] args) {
		int num;
		float temp;
		int[] arr;
		System.out.println("Enter the number of students");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		arr=new int[num];
		System.out.println("Enter the marks of students");
		for(int i=0;i<num;i++)
		{
		arr[i]=(int) sc.nextInt();
		}

		for(int i=0;i<num;i++)
		{
		for(int j=i+1;j<num;j++)
		{
		//temp=arr[0];
		if(arr[i]<arr[j])
		{
		temp=arr[j];
		arr[j]=arr[i];
		arr[i]=(int) temp;
		}
		}
		}
		System.out.println("The priority of marks is");
		for(int i=0;i<num;i++)
		{
		System.out.println(arr[i]);
		}
	}
}



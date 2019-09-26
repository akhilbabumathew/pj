package student;

import java.util.Scanner;

public class Failed {
	public static void main(String[]args) {
		int num,i,c=0;
		int []arr;
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
			if(arr[i]<50)
			{
				c++;
		}
	  
		
	}
		System.out.println("the average is "+c);
	
}}

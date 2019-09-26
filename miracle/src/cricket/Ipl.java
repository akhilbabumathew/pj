package cricket;

	import java.util.Scanner;

	public class Ipl {

	public static void main(String[] args)
	{
	int n;
	float sum=0;
	int[] runs;
	int[] balls;
	float[] ecoconomy;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of bowlers");
	n=sc.nextInt();

	runs=new int[n];
	balls=new int[n];
	ecoconomy=new float[n];
	System.out.println("Enter the runs conceded by the bowlers");
	for(int i=0;i<n;i++)
	{
	runs[i]=sc.nextInt();
	}

	System.out.println("Enter the number of balls for each bowler");
	for(int i=0;i<n;i++)
	{
	balls[i]=sc.nextInt();
	}
	System.out.println("Economy of the bowlers is");
	for(int i=0;i<n;i++)
	{
	ecoconomy[i]=(float)runs[i]/(balls[i]/6);
	sum=sum+ecoconomy[i];
	        System.out.println(ecoconomy[i]);
	}
	float x=sum/n;
	System.out.println("The overall economy of the teanm is"+""+x);
	      int count=0;
	for(int i=0;i<n;i++)
	{
	if(ecoconomy[i]<=x)
	count++;
	}
	System.out.println("The number of bowlers eligible are "+""+count);


	}

	}

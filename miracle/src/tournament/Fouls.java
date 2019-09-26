package tournament;

	import java.util.Scanner;

	public class Fouls {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	int n;
	Scanner sc=new Scanner(System.in);
	int arr[];

	System.out.println("Enter the number of players");
	n=sc.nextInt();
	arr=new int[n];
	System.out.println("Enter the number of fouls made by each player");
	for(int i=0;i<n;i++)
	{
	arr[i]=sc.nextInt();
	}
	int temp=arr[0];
	int j=0;
	for(int i=1;i<n;i++)
	{
	if(temp>arr[i])
	{
	temp=arr[i];
	j=i;
	}
	}
	System.out.println("The eligible player is player no:"+(j+1)+"("+temp+" fouls)");
	}

	}


package add;
import java.util.Scanner;
public class Addfac {
public static void main(String[] args) {
int i,sum=0,no;
Scanner hs=new Scanner(System.in);
do
{
System.out.println("Enter the number");
no=hs.nextInt();
}while(no<0);

for(i=1;i<=no;i++)
{
	sum=sum+i;
}
System.out.println("the sum is "+sum);
}
}

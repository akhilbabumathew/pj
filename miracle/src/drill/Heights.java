package drill;

import java.util.Scanner;

public class Heights {

public static void main(String[] args) {

// TODO Auto-generated method stub
int num;
float temp;
float arr[];
System.out.println("Enter the number of students");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
arr=new float[num];
System.out.println("Enter the heights of students");
for(int i=0;i<num;i++)
{
arr[i]=sc.nextFloat();
}

for(int i=0;i<num;i++)
{
for(int j=i+1;j<num;j++)
{
//temp=arr[0];
if(arr[i]>arr[j])
{
temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}
}
}
System.out.println("The heights in order are");
for(int i=0;i<num;i++)
{
System.out.println(arr[i]);
}
}
}

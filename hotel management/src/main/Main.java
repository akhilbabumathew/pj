package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import booking.Booking;
import customer.Customer;
import registeration.Registeration;

public class Main {
public static int booking[] = new int[25];;
public static int regid[] = new int[25];;
static int regID=1;
static Customer customer=new Customer();
public static int Room[]=new int[25];
//public static String email[]=new String[25];
public static int date[]=new int[25];
public static void main(String[] args) throws NumberFormatException, IOException {
// TODO Auto-generated method stub
String name;
String address;
String contactNumber;
String proofType;
String proofID;
int option;
String ac;
String cot;
String cable;
String wifi;
String laundry;
String menu;
String newEmail;

int room;
int f=1;
int c=0;
int cus;
int start ,end;

Registeration reg=new Registeration();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("\n\n\t\t***********MENU***********");
System.out.println("\t1. Register.\r\n" + "\t2. Book.\r\n" + "\t3. Check Status.\r\n" + "\t4. Email.\r\n" + "\t5. All Bookings.\r\n" + "\t6. All Customers.\r\n" + "\t7. Exit.\r\n" + "");
System.out.println("Choose your option:");
option=Integer.parseInt(br.readLine());
switch(option)
{
case 1:
{

System.out.println("Enter your name");
customer.setName(br.readLine());
System.out.println("Enter your address");
customer.setAddress(br.readLine());
System.out.println("Contact Number");
customer.setContactNumber(br.readLine());
System.out.println("E-Mail ID");
customer.setEmail(br.readLine());
System.out.println("Enter proof type");
customer.setProofType(br.readLine());
System.out.println("Enter proof id");
customer.setProofID(br.readLine());
if(f==1)
{
System.out.println("Thank you for Registration. Your registration number is "+ regID);
f=1;
}
regid[regID]=1;
reg.register(customer);
regID++;
break;
}
case 2:
{
if(regID!=0)
{
System.out.println("\t*****Booking:******");
System.out.println("Please choose the services required.");
System.out.println("AC/non-AC(AC/nAC)");
ac=br.readLine();
System.out.println("Cot(Single/Double)");
cot=br.readLine();
System.out.println("With cable connection/without cable connection(C/nC)");
cable=br.readLine();
System.out.println("Wi-Fi needed or not(W/nW)");
wifi=br.readLine();
System.out.println("Laundry service needed or not(L/nL)");
laundry=br.readLine();
System.out.println("Enter the date of booking");
date[c]=Integer.parseInt(br.readLine());
Booking book=new Booking();
book.Book(ac,cot,cable,wifi,laundry);
book.service(ac,cot,cable,wifi,laundry);

if(f==1)
{
//c++;
System.out.println("Thank you for Room Booking. Your room number is "+ (c+1));
Room[c]=regID-1;
c++;
}
booking[c]=1;

}


break;
}
case 3:
{
System.out.println("Enter the room number");
room=Integer.parseInt(br.readLine());
for(int i=1;i<=25;i++)
{
if(booking[room]==1)
{
System.out.println("Room number "+room+" is booked.");
break;
}
else
{
System.out.println("Room number "+room+" is not booked.");
break;
}
}


break;
}
case 4:
{
System.out.println("Enter the customer ID");
cus=Integer.parseInt(br.readLine());
System.out.println("Enter the new email ID");
newEmail=br.readLine();
customer.emailarr[cus]=newEmail;
System.out.println("Updated");
break;
}
case 5:
{
System.out.println("Enter the start date");
start=Integer.parseInt(br.readLine());
System.out.println("Enter the end date");
end=Integer.parseInt(br.readLine());
System.out.println("The bookings made from "+start+" to "+end+" are");
System.out.println("Room number\tCustomer ID");
for(int i=0;i<25;i++)
{
if(date[i]>=start&&date[i]<=end)
{
System.out.println(i+1+"\t"+Room[i]);
}
}

break;
}
case 6:
{
System.out.println("\t\t****Customers list****");
System.out.println("The registered customers are\n");
System.out.println("Customer ID\tCustomer name");
for(int i=0;i<=regID-2;i++)
{
System.out.println("\t"+(i+1)+"\t"+customer.namearr[i]);
}

break;
}
case 7:
{
System.out.println("\t\t**********Bye*************");
System.exit(0);

break;
}


}

System.out.println("Do you continue the main MENU?(y/n)");
menu=br.readLine();
}while(menu.equals("y"));

}

}

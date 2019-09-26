package project;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.Scanner;

public class Main {
public static int regID=0;
public static String str[];
public static int str1[];
public static int c=0;
public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub


String name;
String address;
String contactNumber;
String email;
String proofType;
String proofID;
String i;
String e;
String broom;
int booking[];
booking=new int[25];
Date date;
str=new String[25];

do {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Registration");
System.out.println("Enter your name");
name=br.readLine();
str[c]=name;
c++;
//System.out.println(str[c]);
System.out.println("Enter your address");
address=br.readLine();
System.out.println("Contact Number");
contactNumber=br.readLine();
System.out.println("E-Mail ID");
email=br.readLine();
System.out.println("Enter proof type");
proofType=br.readLine();
System.out.println("Enter proof id");
proofID=br.readLine();
Customer cu=new Customer();
cu.setName(name);
cu.setAddress(address);
cu.setContactNumber(contactNumber);
cu.setEmail(email);
cu.setProofType(proofType);
cu.setProofID(proofID);
cu.register();
System.out.println("Thank you for registering. Your id is "+ ++regID);
//str1[c]=regID;
System.out.println("Do you want continue?");
i=br.readLine();

}while(i.equals("Y"));
String update;
String newe;
String e1;
BufferedReader br3=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Do you want to update the email id?(yes/no)");
update=br3.readLine();
if(update.equals("yes"))
{
System.out.println("Update Email:");
System.out.println("Enter new Email id");
newe=br3.readLine();
System.out.println("Email updated");
Customer cu1=new Customer();
cu1.setName(name);
cu1.setAddress(address);
cu1.setContactNumber(contactNumber);
cu1.setEmail(newe);
cu1.setProofType(proofType);
cu1.setProofID(proofID);
cu1.register();
}
else if(update.equals("no"))
{
System.out.println("Do you want to book a room (y/n)?");
broom=br3.readLine();

System.out.println("Customers list");
System.out.println("The registered customers are");
System.out.println("Customer ID\t\tCustomer name");
int p=0;
for(int j=1;j<=regID;j++)
{
System.out.println("\t"+j+"\t\t"+str[p]);
p++;
}
System.out.println("Thank You");
Booking bg=new Booking();
bg.book();

}
}
}

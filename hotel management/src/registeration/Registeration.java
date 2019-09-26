package registeration;

import customer.Customer;
import main.Main;

public class Registeration {
static int i=0,x,y,j=0,k=1;
Main main=new Main();
public void register(Customer customer)
{
//System.out.println("Thanks for Registration");
System.out.println("*****Your details are******");
System.out.println("Name :"+customer.getName());
System.out.println("Address :"+customer.getAddress());
System.out.println("Contact Number :"+customer.getContactNumber());
System.out.println("Email :"+customer.getEmail());
System.out.println("Proof Type :"+customer.getProofType());
System.out.println("Proof ID :"+customer.getProofID());
k++;

}

}

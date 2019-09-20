package akhil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {

//Hotel(String name2, String address2, String contact2, String email2, String idtype2, String id2);
public static void main(String args[])throws IOException
{
	String name;
	String address;
	String contact;
	String email;
	String idtype;
	String id;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your Name");
	name=br.readLine();
	System.out.println("Enter your Address");
	address=br.readLine();
	System.out.println("Enter your Contact");
	contact=br.readLine();
	System.out.println("Enter your Email");
	email=br.readLine();
	System.out.println("Enter your Idtype");
	idtype=br.readLine();
	System.out.println("Enter your Id");
	id=br.readLine();
	customer miracle=new customer();
	miracle.setName(name);
	miracle.setAddress(address);
	miracle.setContact(contact);
	miracle.setEmail(email);
	miracle.setIdtype(idtype);
	miracle.setId(id);
	miracle.register();
}
	
}
package singleinheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Booking sc=new  Booking();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Booking");
		
		System.out.println("Enter the number of persons");
		sc.setPersons(Integer.parseInt(br.readLine()));
		System.out.println("Enter the number of days");
		sc.setTotal_Days(Integer.parseInt(br.readLine()));
		System.out.println("Enter the room type");
		sc.setRoomType(br.readLine());
		System.out.println("Enter the tariff for single person");
		sc.setTariff(Integer.parseInt(br.readLine()));
		double total=sc.roomBooking();
		System.out.println(total);
	}
}

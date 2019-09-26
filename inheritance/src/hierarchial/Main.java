package hierarchial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int person;
	static int total_Days;
	static double tariff;
	static String roomType;
	static int month;
	static int peakCharges;
	static int discount;
	static double total_price;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		
		Booking b=new Booking();
		Leakseason L=new Leakseason();
		Peakseason P=new Peakseason();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Booking");
		System.out.println("Enter the number of persons");
		person=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of days");
		total_Days=Integer.parseInt(br.readLine());
		System.out.println("Enter the room type");
		roomType=br.readLine();
		
		System.out.println("Enter the month");
		month=Integer.parseInt(br.readLine());
		if(month==1||month==2||month==3||month==7||month==8||month==10)
		{
			System.out.println("Enter the discount");
			discount=Integer.parseInt(br.readLine());
			System.out.println("Enter the tariff for single person");
			tariff=Double.parseDouble(br.readLine());
			b.setTariff(tariff);
			total_price=L.roombook(person, total_Days,roomType,month,discount,tariff);
		}
		if(month==4||month==5||month==6||month==9||month==11||month==12)
		{
			System.out.println("Enter the peak charge");
			peakCharges=Integer.parseInt(br.readLine());
			System.out.println("Enter the tariff for single person");
			tariff=Double.parseDouble(br.readLine());
			b.setTariff(tariff);
			total_price=P.roomBooking(person, total_Days, roomType,month,peakCharges, tariff);
		}
		System.out.println("Total Price "+total_price);
	}

}

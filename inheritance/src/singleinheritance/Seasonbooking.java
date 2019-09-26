package singleinheritance;
import singleinheritance.Booking;
public class Seasonbooking extends Booking{
	public double roomBooking(int persons,int total_Days,double tariff,String roomType) {
		return super.roomBooking();
	}
}


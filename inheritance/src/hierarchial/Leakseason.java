package hierarchial;

public class Leakseason extends Booking
{
	
	

	public double roombook(int person, int total_Days, String roomType, int month, int discount, double tariff) {
		// TODO Auto-generated method stub
		double totalprice=super.roomBooking(person, total_Days, tariff, roomType);
		double dis=totalprice*discount/100;
		
		return totalprice-dis;
	}
}
package hierarchial;

public class Peakseason  extends Booking {
	int month;
	int peakCharges;
	public double roomBooking(int person,int total_Days,String roomType,int month,int peakCharges,double tariff)
	{
		double totalpri=super.roomBooking(person, total_Days, tariff, roomType);
		double prices=peakCharges*totalpri;
		return prices;
	}
}
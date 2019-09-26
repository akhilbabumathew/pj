package hierarchial;

public class Booking {
	private int person;
	private int total_Days;
	private double tariff;
	private	String roomType;
	private int month;
	private int peakCharges;
	private int discount;
	public double total;
	
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public int getTotal_Days() {
		return total_Days;
	}
	public void setTotal_Days(int total_Days) {
		this.total_Days = total_Days;
	}
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getPeakCharges() {
		return peakCharges;
	}
	public void setPeakCharges(int peakCharges) {
		this.peakCharges = peakCharges;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public double roomBooking(int person,int total_Days,double tariff,String roomType)
	{
		total=person*total_Days*tariff;
		return total; 
	}
}

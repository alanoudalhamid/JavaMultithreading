
public class Movie{

	private int availability = 10;
	private int maxCapacity = 20;
	
	public void updateBooking(int bookingAction){
		switch(bookingAction){
		case 1:
			book();
			break;
		case 2:
			cancel();
			break;
		default:
			System.out.print("Invalid input");
		}
	}
	
	public void book(){
		if(availability>=maxCapacity){
			System.out.print("No seats available");
			return;
		}
		updateAvailability(1);
		System.out.println("Movie booked succesfully");
		System.out.println("Current movie availability: "+this.availability);
	}
	
	public void cancel(){
		if(availability == maxCapacity){
			System.out.print("Movie booking record not found");
			return;
		}
		updateAvailability(-1);
		System.out.println("Booking cancelled succesfully");
		System.out.println("Current movie availability: "+this.availability);
	}
	
	private void updateAvailability(int availability){
		//availability = 1 when cancellation
		//availability = -1 when booking
		this.availability += availability;
	}
	
	public int getAvailability(){
		return this.availability;
	}
	
}

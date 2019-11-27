
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
	
	public int book(){
		if(availability>=maxCapacity){
			System.out.print("No seats available");
		}
		updateAvailability(1);
		return 1;
	}
	
	public int cancel(){
		if(availability == maxCapacity){
			System.out.print("Movie booking record not found");
		}
		updateAvailability(-1);
		return 1;
		
	}
	private int getAvailability(){
		return this.availability;
	}
	
	private void updateAvailability(int availability){
		//availability = 1 when cancellation
		//availability = -1 when booking
		this.availability += availability;
	}
	
	
}


public class Movie{

	private int availability = 10;
	private int maxCapacity = 20;
	public Object movieController = new Object();
	
	public void updateBooking(int bookingAction){
		switch(bookingAction){
		case 1:
			book();
			break;
		case 2:
			cancel();
			break;
		default:
			System.out.println(Thread.currentThread().getName()+"Action input is invalid");
		}
	}
	
	public void book(){
		if(availability>=maxCapacity){
			System.out.print("No seats available");
			return;
		}
		System.out.println(Thread.currentThread().getName()+" is booking a movie");
		availability += 1;
		System.out.println("Movie booked succesfully");
		System.out.println("Current movie availability: "+availability);
	}
	
	public void cancel(){
		if(availability == maxCapacity){
			System.out.print("Movie booking record not found");
			return;
		}
		System.out.println(Thread.currentThread().getName()+" is cancelling movie booking");
		availability -= 1;
		System.out.println("Booking cancelled succesfully");
		System.out.println("Current movie availability: "+availability);
	}
	
	
	public int getAvailability(){
		return availability;
	}
}

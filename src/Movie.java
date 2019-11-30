
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
	//=======================Critical Section============================
	public void book(){
		System.out.println(Thread.currentThread().getName()+" is booking a movie");
		if(availability>=maxCapacity){
			System.out.print("No seats available");
			return;
		}
		availability += 1;
		System.out.println("Movie booked succesfully");
		System.out.println("Current movie availability: "+availability);
	}
	
	public void cancel(){
		System.out.println(Thread.currentThread().getName()+" is cancelling movie booking");
		if(availability == 0){
			System.out.println("Movie booking record not found");
			return;
		}
		availability -= 1;
		System.out.println("Booking cancelled succesfully");
		System.out.println("Current movie availability: "+availability);
	}
	
	
	public int getAvailability(){
		return availability;
	}
	//====================================================================
}

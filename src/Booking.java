

public class Booking implements Runnable{
	
	private Movie movie;
	private int bookingAction;
	
	public Booking(Movie movie, int bookingAction){
		this.movie = movie;
		this.bookingAction = bookingAction;
	}
	
	public void run(){
		try{
			synchronized(movie.movieController){
				movie.updateBooking(bookingAction);
			}
		}
		catch(Exception e){}
	}

}

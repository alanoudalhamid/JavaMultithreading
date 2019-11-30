import java.util.concurrent.locks.*;

public class Booking implements Runnable{
	
	private Movie movie;
	private int bookingAction;
	private final Lock queueLock = new ReentrantLock();
	
	public Booking(Movie movie, int bookingAction){
		this.movie = movie;
		this.bookingAction = bookingAction;
	}
	
	public void run(){
		try{
			synchronized(movie.movieController){
				//Synchronize thread access to critical section, once it's being read/modified by a thread, other threads will wait
				//Synchronization is used in combinations with locks to avoid Deadlocks. When to locks try to locks the same section at the same time, both threads will be blocked indefinitely
				queueLock.lock();
				//If a thread locks a critical section, other threads trying to access the same section will be blocked waiting until the section is unlocked
				movie.updateBooking(bookingAction);//Critical Section
				queueLock.unlock();//
			}
		}
		catch(Exception e){}
	}//The thread is automatically destroyed after the run() method

}

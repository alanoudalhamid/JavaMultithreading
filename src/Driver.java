import java.util.*;

public class Driver {

	private static Scanner read;

	public static void main(String args[]){

		read = new Scanner(System.in);
		Movie aladdin = new Movie();
		int numOfThreads;
		
		System.out.println("Current movie availability: "+aladdin.getAvailability());
		System.out.println("Type number of concurrent threads");
		numOfThreads = read.nextInt();
		Thread[] threads = new Thread[numOfThreads];
		try{
			//Initiating threads, based on user's input
			for (int i=0; i<threads.length;i++){
				System.out.printf("Please enter action for thread %d ('1' to book Aladdin, type '2' to cancel Aladdin booking)\n",i);
				int action = read.nextInt();
				threads[i]= new Thread(new Booking(aladdin, action));
				}
			//Running Threads
				for(int i = 0; i<threads.length;i++){
					threads[i].start();
					threads[i].join();
				}
			}
			catch(Exception e){}
				
		}
	}


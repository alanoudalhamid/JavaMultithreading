import java.util.*;

public class Driver {

	public static void main(String args[]){
		Scanner read = new Scanner(System.in);
		Movie aladdin = new Movie();
		int action;
		
		if(args.length>=2){
			Thread[] threads = new Thread[args.length];
			for (int i=0; i<threads.length;i++){
				System.out.print("Type '1' to book Aladdin, type '2' to cancel Aladdin booking");
				action = read.nextInt();
				try{
				threads[i]= new Thread(new Booking(aladdin, action));
				threads[i].start();
				threads[i].join();
				}
				catch(Exception e){}
				
			}
		}
	}
}

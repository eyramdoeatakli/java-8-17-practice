package runnable;

import optionals.OptionalExamples;

public class AnonRunnable {

	public static void main(String[] args) {
		Runnable myRunnable =
				new Runnable(){
			public void run(){
				System.out.println("Runnable running");
			}
		};
		Runnable r1 = () -> System.out.println("Hello World 1");		    
		myRunnable.run();
		r1.run();
		
//		OptionalExamples myRunnable2=new OptionalExamples();

	}
}

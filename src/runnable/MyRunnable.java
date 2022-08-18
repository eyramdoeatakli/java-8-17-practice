package runnable;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		       System.out.println("MyRunnable running");
		    
	}
	
	public static void main(String[] args) {
		new MyRunnable().run();
	}

}

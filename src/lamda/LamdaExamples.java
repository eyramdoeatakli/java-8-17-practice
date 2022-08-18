package lamda;

public class LamdaExamples {
	
//	(String s) -> s.length()
	
	Runnable r1 = () -> System.out.println("Hello World 1");
	
	Runnable r2 = new Runnable() {
		    public void run() {
		        System.out.println("Hello World 2");
		} };
		

}

package ejecutable03;

import java.io.IOException;

public class ejecutable03 {

	public static void main(String [] args) throws IOException, InterruptedException {
		
		ProcessBuilder constructor = new ProcessBuilder("firefox");
		Process firefox = constructor.start();
		
		Thread.sleep(1000);
		if (firefox.isAlive()) {
			
			System.out.println("proceso vivo, pid ser: " + firefox.pid());
			
		} else {
			
			System.out.println("proceso sa morido");
			
		}
		
		firefox.destroy();
		Thread.sleep(1000);
		
		if (firefox.isAlive()) {
			
			System.out.println("proceso vivo, pid ser: " + firefox.pid());
			
		} else {
			
			System.out.println("proceso sa morido");
			
		}
		
	}
	
}

package ejecutable01;

import java.util.concurrent.Executors;

public class comando {

	public static void main(String[] args) throws Exception {
		
		System.out.println(System.getProperty("os.name"));
		
		Process proceso = Runtime.getRuntime().exec("ls /f -l");
		StreamGobbler gobb = new StreamGobbler(proceso.getInputStream(), System.out::println);
		
		Executors.newSingleThreadExecutor().submit(gobb);
		int exitCode = proceso.waitFor();
		System.out.println("Codigo de finalización del proceso: " + exitCode);

	}
	
}

package ejecutable01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class StreamGobbler implements Runnable {
		
	private InputStream input;
	private Consumer<String> consumer;
	
	public StreamGobbler(InputStream input, Consumer<String> consumer) {
		
		this.input = input;
		this.consumer = consumer;
				
	}
	
	public void run() {
		new BufferedReader(new InputStreamReader(input)).lines().forEach(consumer);
	
	}

}

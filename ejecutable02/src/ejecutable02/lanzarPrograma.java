package ejecutable02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lanzarPrograma {

	public static void main(String [] args) throws IOException {
		
		Process proceso = Runtime.getRuntime().exec("ls");
		BufferedReader salida = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
		
		while(salida.ready()){
			
			System.out.println(salida.readLine());
			
		}
		
	}
	
}

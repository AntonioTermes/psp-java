package ejecutable04;

import java.io.IOException;

public class ejecutarBash {
	
	public static void main(String [] args) throws InterruptedException, IOException{
		
		ProcessBuilder constructor = new ProcessBuilder("bash", "/home/alumno/repos/psp-test/retorno.sh", "3");
		Process proc = constructor.start();
		int retorno = proc.waitFor();
		System.out.println(retorno);
		
		constructor = new ProcessBuilder("bash", "/home/alumno/repos/psp-test/retorno.sh", String.valueOf(retorno));
		proc = constructor.start();
		retorno = proc.waitFor();
		System.out.println(retorno);
		
		
	}

}

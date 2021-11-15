
public class HiloEjecutor extends Thread {

	private String rutaFichero;
	
	public HiloEjecutor(String RutaFichero) {
	
		this.rutaFichero = RutaFichero;
		
	}
	
	public void run() {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String[] vectorArgs = {rutaFichero};
		ContadorPalabras.main(vectorArgs);
		
	}
	
}

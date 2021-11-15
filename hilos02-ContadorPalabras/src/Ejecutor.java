import java.util.ArrayList;

public class Ejecutor {

	public static void main(String[] args) {

		/*
		 * String [] vectorArgs = {"/home/alumno/text.txt"};
		 * ContadorPalabras.main(vectorArgs); System.out.println("Test"); String []
		 * vectorArgs2 = {"/home/alumno/texto.txt"}; ContadorPalabras.main(vectorArgs2);
		 */

		/*
		 * String rutaFichero = "/home/alumno/texto.txt"; HiloEjecutor h1 = new
		 * HiloEjecutor(rutaFichero); h1.start();
		 */

		System.out.println(System.nanoTime());
		ArrayList<String> ficheros = new ArrayList<String>();
		ficheros.add("/home/alumno/texto.txt");
		ficheros.add("/home/alumno/text.txt");
		ficheros.add("/home/alumno/texto.txt");
		ficheros.add("/home/alumno/text.txt");
		ficheros.add("/home/alumno/texto.txt");
		ficheros.add("/home/alumno/text.txt");

		ArrayList<HiloEjecutor> listaHilos = new ArrayList<HiloEjecutor>();
		for (String ruta : ficheros) {

			listaHilos.add(new HiloEjecutor(ruta));

		}
		System.out.println("Hilos creados:");
		for (HiloEjecutor hilo : listaHilos) {
			
			try {
				
				hilo.join();

			} catch (InterruptedException e) {
				
				e.printStackTrace();

			}

		}

		System.out.println("Hilos lanzados:");
		System.out.println(System.nanoTime());

	}
}

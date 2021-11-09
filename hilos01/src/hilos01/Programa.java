package hilos01;

public class Programa {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Soy el hilo principal, voy a lanzar la tarea");
		Tarea tarea = new Tarea();
		tarea.start(); //lanzamos con el método start aunque hayamos implementado el run
		Thread thread = new Thread(new TareaRunnable());
		thread.start();
		tarea.join();
		thread.join();
		System.out.println("Este es el final del hijo principal");
		
	}

}

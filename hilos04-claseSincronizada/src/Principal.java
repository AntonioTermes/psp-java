public class Principal {

	public static void main(String[] args) throws InterruptedException {
		
		ListaCompra lista = new ListaCompra();
		
		new Thread(new hiloMonitor(lista)).start();
		
		synchronized (lista) {
		
			lista.notify();
			
		}
		
		new Thread(new hiloInsertador(lista,"Tomates")).start();
		new Thread(new hiloInsertador(lista,"Manzanas")).start();
		new Thread(new hiloInsertador(lista,"Zumo")).start();
		new Thread(new hiloInsertador(lista,"Peras")).start();
		new Thread(new hiloInsertador(lista,"Pasta")).start();
		new Thread(new hiloInsertador(lista,"Atún")).start();
		
		Thread.sleep(500);

	}

}

import java.util.ArrayList;

public class hiloLector implements Runnable{

	private ArrayList<String> listaCompra;
	
	public hiloLector(ArrayList<String> lista) {
		
		this.listaCompra = lista;
		
	}
	
	public void run() {
		synchronized(listaCompra) {
			
			System.out.println(listaCompra);
			
		}
		
	}

}

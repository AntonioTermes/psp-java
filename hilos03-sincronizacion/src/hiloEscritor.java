import java.util.ArrayList;

public class hiloEscritor implements Runnable{
	
	ArrayList<String> lista;
	String producto;

	public hiloEscritor(String p, ArrayList<String> listaC) {
		
		this.lista = listaC;
		this.producto = p;
		
	}

	public void run() {
		
		synchronized(lista){
			
			lista.add(producto);
			
		}
		
	}

}

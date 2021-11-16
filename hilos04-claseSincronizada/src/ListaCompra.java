import java.util.ArrayList;

public class ListaCompra {
	
	ArrayList<String> lista;

	public ListaCompra() {
		
		this.lista = new ArrayList<String>();
		
	}
	
	public synchronized void anyadirProducto(String prod) {
		
		this.lista.add(prod);
		
	}
	
	public synchronized void extraerProducto(String prod) {
		
		boolean resultado = this.lista.remove(prod);
		if(!resultado) {
			
			System.out.println("[ListaCompra]: Advertencia, producto " + prod + " no encontrado en la lista.");
			
		}
		
	}

	public synchronized String toString() {
		
		return "ListaCompra [lista=" + lista + "]";
		
	}
	
	

}
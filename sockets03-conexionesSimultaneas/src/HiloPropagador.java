import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class HiloPropagador implements Runnable {

	ArrayList<Socket> clientes;
	ColaMensajes colaMensajes;
	
	public HiloPropagador(ArrayList<Socket> clientes, ColaMensajes colaMensajes) {
		
		super();
		this.clientes = clientes;
		this.colaMensajes = colaMensajes;
		
	}
	
	public void run() {
		
		while(true) {
			
			synchronized(colaMensajes) {
				
				try {
					colaMensajes.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			Mensaje m = colaMensajes.obtenerMensaje();
			for(Socket socket : clientes) {
				
				DataOutputStream salida = null;
				
				try {
					salida = new DataOutputStream(socket.getOutputStream());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					salida.writeUTF(m.toString());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		}
		
	}

}

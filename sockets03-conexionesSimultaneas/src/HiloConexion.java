import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class HiloConexion extends Thread {

	Socket socket;
	
	public HiloConexion(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		
		System.out.println("Conectado cliente desde: " + socket.getInetAddress());
		System.out.println("Puerto local: " + socket.getLocalPort());
		System.out.println("Puerto remoto: " + socket.getPort());
		System.out.println("Ip remota: " + socket.getInetAddress());
		DataInputStream entrada = null;
		
		try {
			
			entrada = new DataInputStream(socket.getInputStream());
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		try {
			
			String mensaje = entrada.readUTF();
			String nombre = mensaje;
			while(!mensaje.equals("quit")) {
				
				System.out.println("[" + nombre + "]: " + mensaje);
				mensaje = entrada.readUTF();
				
			}
			
			System.out.println("El cliente " + nombre + " quiere salir");
			entrada.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

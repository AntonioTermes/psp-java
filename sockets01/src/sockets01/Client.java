package sockets01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("localhost", 5252);

		DataInputStream entrada = new DataInputStream(socket.getInputStream());
		System.out.println(entrada.readUTF());		
		
		DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
		salida.writeUTF("Hola server");
	}

}

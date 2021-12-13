package sockets01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket servSock = new ServerSocket(5252);
		Socket socket = servSock.accept();
		System.out.println(socket.getInetAddress());
		
		DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
		salida.writeUTF("Hola socket");
		
		DataInputStream entrada = new DataInputStream(socket.getInputStream());
		System.out.println(entrada.readUTF());		

	}

}

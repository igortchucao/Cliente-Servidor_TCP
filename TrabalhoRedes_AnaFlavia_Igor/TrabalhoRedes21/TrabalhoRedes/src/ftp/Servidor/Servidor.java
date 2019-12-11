package ftp.Servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {

	private static final int PORTA_PADRAO = 8080;

	public static void main(String[] args) {
		try {
			ServerSocket socketServidor = new ServerSocket(PORTA_PADRAO);

			System.out.println("Servidor iniciado ...");
			System.out.println("------------------------------");
			System.out.println("Ouvindo na porta: " + PORTA_PADRAO);
			System.out.println("Pasta de trabalho: " + "Servidor");

			while (true) {
				Socket conexao = socketServidor.accept();
				new Thread(new ServerThreads(conexao)).start();
				Thread.interrupted();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

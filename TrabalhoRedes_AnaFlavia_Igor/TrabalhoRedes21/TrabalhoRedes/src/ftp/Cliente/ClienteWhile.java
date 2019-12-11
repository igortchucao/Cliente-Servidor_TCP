package ftp.Cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteWhile {

	public static String caminhoDestino = "C:\\Users\\Thiago\\Desktop\\Cliente\\";
	private static String IP = "localhost";
	private static final int port = 8080;
	private static boolean User = false;

        public ClienteWhile() {
        /*try {
            Socket clientConnection = new Socket(IP, port);*/
            System.out.println("connected" + IP + port);
        /*} catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
        public static ArrayList<String> ls(String dir) throws IOException {

		File file = new File(dir);
		File afile[] = file.listFiles();
		int i = 0;
		ArrayList<String> arqs = new ArrayList<String>();
		for (int j = afile.length; i < j; i++) {
			File arquivos = afile[i];
			arqs.add(arquivos.getName());
		}
		return arqs;
	}
	public ArrayList<String> comando(String comando, String arquivo) {
		try {
			Socket clientConnection = new Socket(IP, port);

			DataInputStream inPut = new DataInputStream(clientConnection.getInputStream());
			DataOutputStream outPut = new DataOutputStream(clientConnection.getOutputStream());
			Scanner scan = new Scanner(System.in);
                        outPut.writeUTF(comando);
			switch (comando) {
			case "lsC":
                            ArrayList<String> ls= new ArrayList<String>();
                            //RECEBE O TAMANHO DO ARRAY
                            int lim = inPut.readInt();
                            for(int i = 0; i < lim; i++) {
                                ls.add(inPut.readUTF());
                                System.out.println(ls.get(i));
                            }
				// RECEBE todos os arquivos do diretorio
				return ls;
                        case "lsS":
                            System.out.println("entrou no lsS");
				ArrayList<String> lsS= new ArrayList<String>();
				lsS = ls(caminhoDestino);
				//ENVIA TAMANHO DO VETOR
				outPut.writeInt(lsS.size());
				for(int i = 0; i < lsS.size(); i++) {
					System.out.println(lsS.get(i));
					outPut.writeUTF(lsS.get(i));
				}
				return lsS;
                            
                            
			case "get":
				// ENVIA o nome do arquivo
				outPut.writeUTF(arquivo);

				if (inPut.readBoolean()) {
					// cria o objeto para o arquivo que sera enviado
					ObjectInputStream inPutObject = new ObjectInputStream(clientConnection.getInputStream());

					// RECEBE o nome do arquivo
					String fileName = inPutObject.readUTF();

					// verifica se o arquivo existe
					if (fileName != null) {
						// RECEBE o tam do arquivo para escrever no menu
						long tamanhoArquivo = inPutObject.readLong();
						System.out.println("Enviando arquivo: " + fileName + " - " + tamanhoArquivo + " bytes.");

						// Verifica se existe a pasta de destino
						File file = new File(caminhoDestino);
						if (file.exists() == false) {
							// se nao existir, cria
							file.mkdir();
						}

						// cria o File para receber o arquivo
						FileOutputStream arquivoOutPut = new FileOutputStream(caminhoDestino + fileName);

						// cria um buffer onde ira guardar os bits do arquivo
						byte[] buffer = new byte[4096];
						while (true) {
							// lê o maximo de bits que ele consegue
							int len = inPutObject.read(buffer);
							if (len == -1)
								break;
							// escreve os bits no arquivo
							arquivoOutPut.write(buffer, 0, len);
						}
						arquivoOutPut.flush();
						arquivoOutPut.close();
					}
				} else {
					System.out.print("Arquivo não Existe");
				}
				return null;
			case "put":
				// ENVIA o nome do arquivo
				outPut.writeUTF(arquivo);

				// abre o arquivo da pasta cliente
				File file = new File(caminhoDestino +arquivo);

				// verifica se o arquivo existe
				if (file.exists()) {
					// ENVIA a existencia do arquivo
					outPut.writeBoolean(true);

					// cria o object para a transferencia do arquivo
					ObjectOutputStream outPutObject = new ObjectOutputStream(clientConnection.getOutputStream());
					System.out.println("Transferindo o arquivo: " + file.getName());

					// ENVIA o nome do arquivo
					outPutObject.writeUTF(file.getName());

					// ENVIA o tam do arquivo
					outPutObject.writeLong(file.length());
					// cria o File para enviar o arquivo
					FileInputStream arquivoInput = new FileInputStream(file);
					byte[] buffer = new byte[4096];

					while (true) {
						int tamanhoArquivo = arquivoInput.read(buffer);
						if (tamanhoArquivo == -1)
							break;
						outPutObject.write(buffer, 0, tamanhoArquivo);
					}
					outPutObject.close();
					arquivoInput.close();
				} else {
					outPut.writeBoolean(false);
					System.out.println("Arquivo não existe");
				}
				return null;
			case "exit":
				System.exit(0);
			}
			outPut.close();
			inPut.close();
			clientConnection.close();
		} catch (Exception e) {
			System.err.println("CLIENTE ERRO: " + e.toString());
			e.printStackTrace();
		}
            return null;
	}
}

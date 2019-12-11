package ftp.Servidor;

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

public class ServerThreads implements Runnable {

	public static String caminho = "C:\\Users\\Thiago\\Desktop\\Servidor\\";
	private static boolean User = false;
	private static final String USUARIO = "igor";
	private static final int SENHA = 1;
	private Socket conexao;

	public ServerThreads(Socket conexao) {
		this.conexao = conexao;
	}

	@Override
	public void run() {
		try {
			System.out.println("thread");
			DataInputStream inPut = new DataInputStream(conexao.getInputStream());
			DataOutputStream outPut = new DataOutputStream(conexao.getOutputStream());
			// RECEBE comando
			switch (inPut.readUTF()) {
			case "lsC":
				System.out.println("entrou no ls");
				ArrayList<String> ls= new ArrayList<String>();
				ls = ls(caminho);
				//ENVIA TAMANHO DO VETOR
				outPut.writeInt(ls.size());
				for(int i = 0; i < ls.size(); i++) {
					System.out.println(ls.get(i));
					outPut.writeUTF(ls.get(i));
				}
				break;
			case "lsS":
				ArrayList<String> lsS= new ArrayList<String>();
                //RECEBE O TAMANHO DO ARRAY
                int lim = inPut.readInt();
                for(int i = 0; i < lim; i++) {
                    lsS.add(inPut.readUTF());
                    System.out.println(lsS.get(i));
                }
				// RECEBE todos os arquivos do diretorio
				break;
			case "get":
				// RECEBE o nome do arquivo
				String arquivo = inPut.readUTF();
				System.out.println("Arquivo :" + arquivo);
				File file = new File(caminho + arquivo);

				if (file.exists()) {
					// ENVIA a existecia do arquivo
					outPut.writeBoolean(true);

					ObjectOutputStream out = new ObjectOutputStream(conexao.getOutputStream());
					System.out.println("Transferindo o arquivo: " + file.getName());

					// ENVIA o nome do arquivo
					out.writeUTF(file.getName());

					// ENVIA o tam do arquivo
					out.writeLong(file.length());
					FileInputStream filein = new FileInputStream(file);
					byte[] buf = new byte[4096];

					while (true) {
						int len = filein.read(buf);
						if (len == -1) {
							break;
						}
						out.write(buf, 0, len);
					}
					out.flush();
					out.close();
				} else {
					// ENVIA a existecia do arquivo
					outPut.writeBoolean(false);
				}
				break;
			case "put":
				// RECEBE o nome do arquivo
				String arquivoTemp = inPut.readUTF();
				if (inPut.readBoolean()) {
					ObjectInputStream inFile = new ObjectInputStream(conexao.getInputStream());

					// RECEBE o nome do arquivo
					String fileName = inFile.readUTF();

					if (fileName != null) {
						// RECEBE o tam do arquivo
						long size = inFile.readLong();
						System.out.println("Processando arquivo: " + fileName + " - " + size + " bytes.");

						// Verifica se tem a pasta de destino criada, caso nao tenha ele cria
						File filePut = new File(caminho);
						if (filePut.exists() == false) {
							filePut.mkdir();
						}

						FileOutputStream fos = new FileOutputStream(caminho + fileName);
						byte[] buf = new byte[4096];
						while (true) {
							int len = inFile.read(buf);
							if (len == -1)
								break;

							fos.write(buf, 0, len);
						}
						fos.flush();
						fos.close();
					}
				}
				break;
			}
			inPut.close();
			outPut.close();
			this.conexao.close();
		} catch (Exception e) {
			System.err.println("SERVIDOR ERRO: " + e.toString());
			e.printStackTrace();
		}
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

}

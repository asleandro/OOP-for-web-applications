package rede;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket s0 = new ServerSocket(5678);
		while (true) {
			Socket s1 = s0.accept();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s1.getOutputStream()));
			pw.println(new Date());
			pw.flush();
			s1.close();
		}
	}

}

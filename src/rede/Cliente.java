package rede;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Cliente {
	public static void main(String[] args) throws IOException {
		Socket s2 = new Socket("localhost", 5678);
		BufferedReader bf= new BufferedReader(new InputStreamReader(s2.getInputStream()));
		ServerSocket s0 = new ServerSocket();
		while (true) {
			Socket s1 = s0.accept();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s1.getOutputStream()));
			pw.println(new Date());
			pw.flush();
			s1.close();
		}
	}
}

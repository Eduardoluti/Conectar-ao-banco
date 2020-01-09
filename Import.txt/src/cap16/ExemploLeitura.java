package cap16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExemploLeitura {
	
	public static void main(String[] args) {
		
		try {
			InputStream is = System.in;//new FileInputStream("C:\Users\Nicole\Desktop\efd.txt.txt");
			int byteLido = is.read();
			while (byteLido != -1) {
				System.out.print((char)byteLido);
				byteLido = is.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

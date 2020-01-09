package cap16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ExemploEscrita {
	
	public static void main(String[] args) {
		
		try {
		
			OutputStream os = System.out;//new FileOutputStream("saida.txt");
			os.write("Texto do arquivo".getBytes());
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

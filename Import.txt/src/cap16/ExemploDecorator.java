package cap16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExemploDecorator {
	
	public static void main(String[] args) {
		
		try {
			
			InputStream is = new FileInputStream("");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String linhaLida = br.readLine();
			while(linhaLida != null) {
				System.out.println(linhaLida);
				linhaLida = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

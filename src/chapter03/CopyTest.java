package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("MaDari.JPG");
			fos = new FileOutputStream("MaDari2.JPG");
			
			int data = -1;
			while( (data = fis.read()) != -1 ) {
				fos.write(data);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다. :" + e);
			return;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {			
				try {
					if(fis != null) fis.close();
					if(fis != null)	fos.close();	
				} catch (IOException e) {					
					e.printStackTrace();
				}								
		}

	}

}

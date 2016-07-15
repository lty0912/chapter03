package chapter03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
	
	public static void main(String[] args) {
		
		FileOutputStream fis = null;
		BufferedOutputStream bos = null;
		
		
		try {
			fis = new FileOutputStream("123.txt");
			bos = new BufferedOutputStream(fis);
			
			for( int i= '1'; i<'9'; i++) {
				bos.write(i);
			}
			
			bos.flush(); // 내부 버퍼의 내용을 파일에 쓰기
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

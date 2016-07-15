package chapter03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		try {
			// BufferedOutputStream bos = new BufferedOutputStream(new
			// FileOutputStream("123.txt"));
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			for (int i = 49; i < 57; i++) {
				bos.write(i);
			}

			// bos.flush(); //내부 버퍼의 내용을 파일에 쓰기
			bos.close();// 닫을 때 자동으로 flush가 일어남

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

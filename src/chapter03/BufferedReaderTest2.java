package chapter03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("ms949_2.txt");
//			FileInputStream fis = new FileInputStream("utf8.txt");
			InputStreamReader isr = new InputStreamReader(fis,"ms949");	//"���ڵ� ���"
			BufferedReader br = new BufferedReader(isr);  //���δ����� �б� ����
			
			String s = null;
			
			while((s = br.readLine()) != null){
				System.out.println(s);
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

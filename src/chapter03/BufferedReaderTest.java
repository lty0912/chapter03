package chapter03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {	//보조스트림

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("./src/chapter03/BufferedReaderTest.java");
			BufferedReader br = new BufferedReader(fr);
			
			String s = null;
			int index = 0;
			
			while((s = br.readLine()) != null){
				String line = String.format("%3d: %s", ++index, s);	//줄 맟쳐주기
				System.out.println(line);
//				System.out.println(++index+":"+s);
			}
			
			br.close(); //하나만 닫아도 다 닫힘!
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}

}

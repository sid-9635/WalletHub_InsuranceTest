package testData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Properties;

import com.github.dockerjava.core.exec.UpdateSwarmCmdExec;

public class ReadStringFromText {
	
	public static String st;
	
	public static String ReadTextFile()
	{
		
		try {
			
			//String currentDirectory = System.getProperty("user.dir")+"\\src\\main\\java\\testData\\TestData";
		
			
			RandomAccessFile file = new RandomAccessFile( System.getProperty("user.dir")+"\\src\\main\\java\\testData\\TestData.txt", "r");
			
				st = file.readLine();
				
			}
			 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();// TODO: handle exception
			}
		
			System.out.println(st);
			return st;
	}

}

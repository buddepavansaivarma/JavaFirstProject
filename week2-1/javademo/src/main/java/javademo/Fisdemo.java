package javademo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;


public class Fisdemo {

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(new File("C:/Users/welcome/Desktop/crossover.txt"));
			System.out.println("File opened");
			int i=0;
			while((i=fis.read())!=-1)
			{
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\nfile closed");
		}
		

	}

}

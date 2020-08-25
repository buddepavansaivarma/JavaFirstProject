package javademo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;


public class Fosdemo {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(new File("C:/Users/welcome/Desktop/chinnu/chinnu-photo.jpg"));
			fos=new FileOutputStream(new File("C:/Users/welcome/Desktop/chinnu/chinnu-new-photo.jpg"));
			int i=0;
			while((i=fis.read())!=-1)
			{
				fos.write(i);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\nfile closed");
		}
		

	}

}

package javademo;


import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class Readerandwriterdemo {

	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader(new File("C:/Users/welcome/Desktop/crossover.txt"));
			fw=new FileWriter(new File("C:/Users/welcome/Desktop/new-crossover.txt"));
			int i=0;
			while((i=fr.read())!=-1)
			{
				fw.write(i);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\nfile closed");
		}
		

	}

}

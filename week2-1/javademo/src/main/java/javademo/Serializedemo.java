package javademo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializedemo {

	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;

		try {
			fos = new FileOutputStream("C:/Users/welcome/Desktop/cross.ser");
			oos = new ObjectOutputStream(fos);
			
			Employee emp= new Employee(1,"pavan",10000,25442);
			oos.writeObject(emp);
			System.out.println("Employee object");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

package javademo;

import java.util.StringTokenizer;

public class Stringtokenizerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st ="Hello I am Pavan";
		StringTokenizer s = new StringTokenizer(st);
		while(s.hasMoreTokens())
		{
			System.out.println(s.nextToken());
		}

	}

}

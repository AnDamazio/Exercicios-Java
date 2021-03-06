package fundamentos;

import java.util.Scanner;

public class Wrapper {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Byte b = 100; //byte
		Short s = 1000;
		
		Integer i = Integer.parseInt(entrada.next()); //int
		Long l = 100000L;
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		entrada.close();
		
		Character c = '#';
		System.out.println(c + "...");
	}
}

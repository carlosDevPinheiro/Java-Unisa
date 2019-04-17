import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int valor = input.nextInt();
		input.close();
		
		for (int i = 1; i <= 10; i++) {			
			System.out.println(i + " x " + valor + " = " + (valor * i) );
		}
	}
}

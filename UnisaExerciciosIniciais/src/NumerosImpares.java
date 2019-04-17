import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero = input.nextInt();
		input.close();
		
		for (int i = 0; i <= numero; i++) {
			
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}

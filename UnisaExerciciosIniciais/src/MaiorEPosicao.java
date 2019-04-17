import java.util.Random;

public class MaiorEPosicao {
	
	public static void main(String[] args) {
		
		
		int[] lista = new int[100];
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
//		for (int i = 0; i <= 100; i++) {
//			lista[i] = input.nextInt();
//		}
		
		Random rdm = new Random();
		
		for (int i : lista) {
			System.out.println(rdm.nextInt());
		}
	}

}

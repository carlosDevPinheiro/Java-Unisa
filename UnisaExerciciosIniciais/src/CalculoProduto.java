
public class CalculoProduto {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		int numero1, numero2, prod;
		numero1 = scan.nextInt();
		numero2 = scan.nextInt();
		
		scan.close();
		
		prod = numero1 * numero2;
		
		System.out.println("PROD = "+ prod);
	

	}

}

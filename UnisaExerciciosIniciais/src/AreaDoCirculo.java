
public class AreaDoCirculo {

	public static void main(String[] args) {
		

		java.util.Scanner scan = new java.util.Scanner(System.in);
		double Area, raio;
		raio = scan.nextDouble();
		Area = 3.14159 * raio * raio;
		
		scan.close();
		System.out.printf("A=%.4f%n", Area);

	}

}




public class SalarioBonus {

	public static void main(String[] args) {
		
		java.util.Scanner scann = new java.util.Scanner(System.in);
		
		String nome;
		double salario,totalVendas,resultado;
		
		nome = scann.nextLine();
		salario = scann.nextDouble();
		totalVendas = scann.nextDouble();
		totalVendas = totalVendas * 0.15;
		resultado = salario + totalVendas;
		
		scann.close();
		System.out.printf("TOTAL = R$ %.2f%n", resultado);
		
	}
}

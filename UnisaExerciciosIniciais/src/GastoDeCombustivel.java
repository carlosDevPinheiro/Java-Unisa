

public class GastoDeCombustivel {

	public static void main(String[] args) {
		
		// tempo gasto
		// velocidade
		// faz 12 km com 1 litro
		// quantidade de litros necessária para realizar a viagem,
		
		java.util.Scanner scann = new java.util.Scanner(System.in);
		double tempo, velocidade, total;
		
		tempo = scann.nextDouble();
		velocidade = scann.nextDouble();
		
		total = (tempo * velocidade) / 12;
		
		scann.close();
		
		System.out.printf("%.3f%n",total);

	}

}

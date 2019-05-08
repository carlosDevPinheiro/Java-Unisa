
public class Matematica {

	public static void main(String[] args) {

		double pi = Math.PI;
		System.out.println(" valor  de PI: " + pi);

		float raio = 2.4f;
		double comprimento = 2 * raio * Math.PI;
		System.out.println(comprimento);

		float precoProdutoA[] = { 11.2f, 15.12f };
		float precoProdutoB[] = { 19.7f, 20 };

		System.out.println("O maior preço do produto A é " + Math.max(precoProdutoA[0], precoProdutoA[1]));
		System.out.println("O menor preço do produto B é " + Math.min(precoProdutoB[0], precoProdutoB[1]));

		System.out.println("1 MB tem " + Math.pow(2, 10) + " KB");
		System.out.println(
				"A raiz quadrada de 121 é " + Math.sqrt(121) + " e a raiz cúbica de 1331 também é " + Math.cbrt(1331));

		// LOGARITIMO ???
		float nr = 0.1f;
		System.out.println("Resultado 1: " + Math.log(nr + 1));
		System.out.println("Resultado 2: " + Math.log1p(nr));

		// Arredondamentos e Valores Absolutos
		float nr2 = -5.75f;
		System.out.println("Absoluto: " + Math.abs(nr2) + "\nInteiro mais baixo: " + Math.ceil(nr2)
				+ "\nInteiro mais alto: " + Math.floor(nr2) + "\nDouble mais próximo: " + Math.rint(nr2)
				+ "\nArredondamento: " + Math.round(nr2));

		int limiteInferior = 5;
		int limiteSuperior = 10;
		int alcance = limiteSuperior - limiteInferior;
		double nrRandomico = Math.random();
		System.out.println(
				"O número randômico escolhido entre 5 e 10 foi " + Math.round(limiteInferior + nrRandomico * alcance));
		
		System.out.println(1870/ 100);
		System.out.println(1994 % 100);
	}

}

import java.util.Scanner;

public class ProjetoDataValida {

	public static void main(String[] args) {

		/*
		 * Para o ano ser bissexto se ele for divisivel por 4 => resto de ser zero não
		 * pode ser divisivel por 100 isto é o resto deve ser diferente de zero
		 * 
		 */

		Scanner input = new Scanner(System.in);

		int dia, mes, ano;
		boolean bissexto, dataValida;

		do {

			bissexto = false;
			dataValida = false;

			System.out.println("Digite o dia: ");
			dia = input.nextInt();
			System.out.println("Digite o mês: ");
			mes = input.nextInt();
			System.out.println("Digite o ano: ");
			ano = input.nextInt();

			if (dia > 0 && dia < 32) {
				// dia valido

				if (mes > 0 && mes < 13) {
					// mes valido

					if (ano > 0) {

						dataValida = true;
					}
				}
			}

			if (!dataValida) {
				System.out.println(String.format("%d/%d/%d => Data invalida", dia, mes, ano));
			}

		} while (!dataValida);

		input.close();

		if ((ano % 4) == 0) {
			
			if ((ano % 100) != 0) {
				bissexto = true;
			}
			
		}
		
		// forma simplificada
		if ((ano % 4) == 0 && (ano % 100) != 0 || ano % 400 == 0) {
			bissexto = true;
		}

		switch (mes) {
		case 1:
			System.out.println(String.format("São Paulo %d Janeiro de %d", dia, ano));
			break;
		case 2:
			if (!bissexto && dia == 29) {
				System.out.println("data invalida");
			} else {
				System.out.println(String.format("São Paulo %d Fevereiro de %d", dia, ano));
			}
			break;
		case 3:
			System.out.println(String.format("São Paulo %d Março de %d", dia, ano));
			break;
		case 4:
			System.out.println(String.format("São Paulo %d Abril de %d", dia, ano));
			break;
		case 5:
			System.out.println(String.format("São Paulo %d Maio de %d", dia, ano));
			break;
		case 6:
			System.out.println(String.format("São Paulo %d Junho de %d", dia, ano));
			break;
		case 7:
			System.out.println(String.format("São Paulo %d Julho de %d", dia, ano));
			break;
		case 8:
			System.out.println(String.format("São Paulo %d Agosto de %d", dia, ano));
			break;
		case 9:
			System.out.println(String.format("São Paulo %d Setembro de %d", dia, ano));
			break;
		case 10:
			System.out.println(String.format("São Paulo %d Outubro de %d", dia, ano));
			break;
		case 11:
			System.out.println(String.format("São Paulo %d Novembro de %d", dia, ano));
			break;
		case 12:
			System.out.println(String.format("São Paulo %d Dezembro de %d", dia, ano));
			break;
		default:
			System.out.println("Mes não encontrado");
			break;
		}

		if (bissexto) {
			System.out.println("Ano bissexto");
		}

	}

}

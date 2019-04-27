package br.com.unisa.projeto;

import java.util.Scanner;

public class Parte3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Integer dia = 28, mes = 7, ano = 1990, mesTabela = 0, resultMod2 = 0, resultMod1 =0 , resultMod3 = 0;

		System.out.println("Digite o dia: ");
		dia = input.nextInt();
		System.out.println("Digite o mes: ");
		mes = input.nextInt();
		System.out.println("Digite o ano: ");
		ano = input.nextInt();

		// convetendo o mes para a tabela meses da formula
		switch (mes) {
		case 1:
			mesTabela = 0;
			break;
		case 2:
			mesTabela = 3;
			break;
		case 3:
			mesTabela = 3;
			break;
		case 4:
			mesTabela = 6;
			break;
		case 5:
			mesTabela = 1;
			break;
		case 6:
			mesTabela = 4;
			break;
		case 7:
			mesTabela = 6;
			break;
		case 8:
			mesTabela = 2;
			break;
		case 9:
			mesTabela = 5;
			break;
		case 10:
			mesTabela = 0;
			break;
		case 11:
			mesTabela = 3;
			break;
		case 12:
			mesTabela = 5;
			break;
		}

		// somando o dia + mes da tabela
		resultMod1 = dia + mesTabela;

		if (resultMod1 > 6) {
			int variavel = 0;

			while (variavel < resultMod1) {
				variavel += 7;
				if (variavel == resultMod1 || variavel > resultMod1) {
					variavel -= 7;
					break;
				}
			}

			resultMod1 = resultMod1 - variavel;

		}

		System.out.println("Resultado modulo 1: " + resultMod1);

		// modulo 2

		String anoString = ano.toString();
		int inicial = anoString.length() - 2;
		int fim = anoString.length();
		int anoDoisDig = Integer.parseInt(anoString.substring(inicial, fim));

		int menorMultiplo28 = 0;
		boolean menor = true;

		while (menor == true) {
			if (menorMultiplo28 < anoDoisDig) {
				menorMultiplo28 += 28;
			} else {
				menorMultiplo28 -= 28;
				menor = false;
			}
		};
		
		resultMod2 = anoDoisDig - menorMultiplo28;
		int reultDivisao = anoDoisDig / 4;
		resultMod2 = resultMod2 + reultDivisao;
		
		String tabelAnoSecString = ano.toString().substring(0,2);
		int tabelAnoSecValue = 0;
		
		switch(tabelAnoSecString) {
				case "16":
				tabelAnoSecValue = 0;
				break;
			case "17":
				tabelAnoSecValue = 5;
				break;
			case "18":
				tabelAnoSecValue = 3;
				break;
			case "19":
				tabelAnoSecValue = 1;
				break;
			case "20":
				tabelAnoSecValue = 0;
				break;
		}
		
		resultMod2 += tabelAnoSecValue;
		
		if(mes == 1 || mes == 2 ) {
			resultMod2 -= 1;
		}
		
		
		// module 3
		
		resultMod3 = resultMod1 + resultMod2;
		
		System.out.println("soma do modulo1 + modulo2 = " +resultMod3);
		
		if (resultMod3 > 6) {
			int varMod3 = 0;
			
			while(varMod3 <= resultMod3) {
				varMod3 += 7;
			}
			
			if(varMod3 > resultMod3) {
				varMod3 -= 7;
			}
			
		   resultMod3 = resultMod3 - varMod3;
		}
		
		
		switch (resultMod3) {
		case 1:
			System.out.println("dia da semana é Domingo");
			break;
		case 2:
			System.out.println("dia da semana é Segunda");
			break;
		case 3:
			System.out.println("dia da semana é Terça");
			break;
		case 4:
			System.out.println("dia da semana é Quarta");
			break;
		case 5:
			System.out.println("dia da semana é Quinta");
			break;
		case 6:
			System.out.println("dia da semana é Sexta");
			break;
		case 7 :
			System.out.println("dia da semana é Sabado");
			break;
		case 0 :
			System.out.println("dia da semana é Sabado");
			break;		
		}
		
	}

}

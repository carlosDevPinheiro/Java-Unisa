package br.com.unisa.projeto;

import java.util.Scanner;

public class Parte3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Integer dia,mes,ano, mesTabela, resultMod2, resultMod1, resultMod3, varLoop = 0;
		Boolean bissexto = false;

		System.out.print("Digite o dia: ");
		dia = input.nextInt();
		System.out.print("Digite o mes: ");
		mes = input.nextInt();
		System.out.print("Digite o ano: ");
		ano = input.nextInt();
		
		input.close();
		
		
		if ((ano % 4) == 0 && (ano % 100) != 0) {
			bissexto = true;			
		} else if (bissexto == false && dia > 28 && mes == 2) {
			
			if(dia > 28) {
				System.out.println("Dia Invalido");
				return;
			}
		}

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
			
		default:
			mesTabela = 0;
			break;
		}

		// somando o dia + mes da tabela
		resultMod1 = dia + mesTabela;
		// zerando varivel de loop
		varLoop = 0;
		
		if (resultMod1 > 6) {			

			while (varLoop < resultMod1) {
				varLoop += 7;
				if (varLoop == resultMod1 || varLoop > resultMod1) {
					varLoop -= 7;
					break;
				}
			}

			resultMod1 = resultMod1 - varLoop;

		}

		System.out.println("Resultado Modulo1: " + resultMod1);
		

		// modulo 2

		String anoString = ano.toString();
		int inicial = anoString.length() - 2;
		int fim = anoString.length();
		int anoDoisDig = Integer.parseInt(anoString.substring(inicial, fim));

		varLoop = 0;
		boolean menor = true;

		while (menor == true) {
			if (varLoop < anoDoisDig) {
				varLoop += 28;
			} else {
				varLoop -= 28;
				menor = false;
			}
		};
		
		resultMod2 = anoDoisDig - varLoop;		
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
		
		System.out.println("Resultado Modulo2: " + resultMod2);
		
		// module 3
		
		resultMod3 = resultMod1 + resultMod2;
	
		
		if (resultMod3 > 6) {
			varLoop = 0;
			
			while(varLoop <= resultMod3) {
				varLoop += 7;
			}
			
			if(varLoop > resultMod3) {
				varLoop -= 7;
			}
			
		   resultMod3 = resultMod3 - varLoop;
		}
		
		System.out.println("Resultado Modulo3: " + resultMod3);
		
		   String display = "dia da semana é:  ***** %s ****";
		
		switch (resultMod3) {
		case 1:			
			System.out.println(String.format(display, "Domingo"));
			break;
		case 2:
			System.out.println(String.format(display, "Segunda-Feira"));
			break;
		case 3:
			System.out.println(String.format(display, "Terça-Feira"));
			break;
		case 4:
			System.out.println(String.format(display, "Quarta-Feira"));;
			break;
		case 5:
			System.out.println(String.format(display, "Quinta-Feira"));
			break;
		case 6:
			System.out.println(String.format(display, "Sexta-Feira"));
			break;
		case 7 :
			System.out.println(String.format(display, "Sábado"));
			break;
		case 0 :
			System.out.println(String.format(display, "Sábado"));
			break;		
		}
		
		if (bissexto.equals(true)) 
			System.out.println("Esse ano é Bissexto");			
		
		varLoop = 0;
	}

}

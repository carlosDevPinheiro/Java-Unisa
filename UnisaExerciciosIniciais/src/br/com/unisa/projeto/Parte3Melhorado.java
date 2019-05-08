package br.com.unisa.projeto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Parte3Melhorado {

	public static void main(String[] args) throws Exception {

		Integer dia, mes, ano, temp = 0, resultMod2, resultMod1, resultMod3, anoDigFinal, anoDigInicial;
		boolean bissexto = false;
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o dia: ");
		dia = ehValido(input.nextInt(), 1, 31, "Dia incorreto");
		System.out.print("Digite o mes: ");
		mes = ehValido(input.nextInt(), 1, 12, "mes incorreto");
		System.out.print("Digite o ano: ");
		ano = ehValido(input.nextInt(), 1900, 3000, "ano incorreto");

		input.close();

		Map<Integer, Integer> tbMeses = new HashMap<Integer, Integer>();
		;
		Map<Integer, Integer> tbSeculos = new HashMap<Integer, Integer>();
		Map<Integer, String> tbSemanas = new HashMap<Integer, String>();

		// populando meses
		tbMeses.put(1, 0);
		tbMeses.put(2, 3);
		tbMeses.put(3, 3);
		tbMeses.put(4, 6);
		tbMeses.put(5, 1);
		tbMeses.put(6, 4);
		tbMeses.put(7, 6);
		tbMeses.put(8, 2);
		tbMeses.put(9, 5);
		tbMeses.put(10, 0);
		tbMeses.put(11, 3);
		tbMeses.put(12, 5);

		bissexto = (ano % 4) == 0 && (ano % 100) != 0 ? true : false;
		if(bissexto && dia > 29 && mes == 2) {
			System.out.println("dia invalido");
			return;
		}		    
		else if(!bissexto && dia > 28 && mes == 2){
			System.out.println("dia invalido");
			return;
		}
		
		// modulo1
		resultMod1 = dia + (tbMeses.get(mes).intValue());

		if (resultMod1 > 6)
			resultMod1 -= ObterMenorMulltiplo(resultMod1, 7, false);

		// modulo2

		anoDigFinal = ano % 100;
		anoDigInicial = ano / 100;
		resultMod2 = ObterMenorMulltiplo(anoDigInicial, 28, false);
		temp = anoDigFinal - resultMod2;
		resultMod2 = anoDigFinal / 4;
		resultMod2 = temp + resultMod2;

		// populnado seculos
		tbSeculos.put(16, 0);
		tbSeculos.put(17, 5);
		tbSeculos.put(18, 3);
		tbSeculos.put(19, 1);
		tbSeculos.put(20, 0);

		resultMod2 += tbSeculos.get(anoDigInicial);

		if (mes < 3)
			resultMod2 -= 1;

		// modulo 3
		resultMod3 = resultMod1 + resultMod2;

		if (resultMod3 > 6)
			resultMod3 = resultMod3 - ObterMenorMulltiplo(resultMod3, 7, true);

		// populando a tabela semanas
		tbSemanas.put(1, "Domingo");
		tbSemanas.put(2, "Segunda-Feira");
		tbSemanas.put(3, "Terça-Feira");
		tbSemanas.put(4, "Quarta-Feira");
		tbSemanas.put(5, "Quinta-Feira");
		tbSemanas.put(6, "Sexta-Feira");
		tbSemanas.put(7, "Sábado");
		tbSemanas.put(0, "Sábado");

		System.out.println(String.format("O dia da Semana é: ****** %s ********", tbSemanas.get(resultMod3)));

		if (bissexto)
			System.out.println("Ano é bissexto !");

	}

	public static int ObterMenorMulltiplo(int valor, int multiplicador, boolean podeSerigual) {
		int varLoop = 0;

		if (!podeSerigual) {

			for (int i = 0; i < valor; i += multiplicador)
				varLoop = i;
		} else {

			for (int i = 0; i <= valor; i += multiplicador)
				varLoop = i;
		}
		return varLoop;
	}

	public static int ehValido(int value, int minimo, int maximo, String mensagem) throws Exception {

		if (value < minimo || value > maximo) {
			throw new Exception(mensagem);
		}
		return value;
	}
}

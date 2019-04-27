package br.com.unisa.projeto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Parte3Melhorado {

	public static void main(String[] args) {

		Integer dia, mes , ano, temp = 0, resultMod2, resultMod1, resultMod3;

		Scanner input = new Scanner(System.in);
		System.out.print("Digite o dia: ");
		dia = input.nextInt();
		System.out.print("Digite o mes: ");
		mes = input.nextInt();
		System.out.print("Digite o ano: ");
		ano = input.nextInt();

		input.close();

		Map<Integer, Integer> tbMeses = new HashMap<Integer, Integer>();
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

		// modulo1

		resultMod1 = dia + (tbMeses.get(mes).intValue());

		if (resultMod1 > 6)
			resultMod1 -= ObterMenorMulltiplo(resultMod1, 7, false);

		// modulo2

		String anoInicial = ano.toString();
		ano = Integer.parseInt(ano.toString().substring(ano.toString().length() - 2, ano.toString().length()));

		resultMod2 = ObterMenorMulltiplo(ano, 28, false);

		temp = ano - resultMod2;
		resultMod2 = ano / 4;

		resultMod2 = temp + resultMod2;

		// populnado seculos
		tbSeculos.put(16, 0);
		tbSeculos.put(17, 5);
		tbSeculos.put(18, 3);
		tbSeculos.put(19, 1);
		tbSeculos.put(20, 0);

		resultMod2 += tbSeculos.get(Integer.parseInt(anoInicial.substring(0, 2)));

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
}

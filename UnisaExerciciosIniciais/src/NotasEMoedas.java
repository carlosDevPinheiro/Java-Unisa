import java.util.*;
//import java.text.*;

public class NotasEMoedas {

	public static void main(String[] args) {

		// MeuCarlos();
		
		Scanner scann = new Scanner(System.in);
//      DecimalFormat df = new DecimalFormat("0");
        double n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
        double centavos, N, m50 = 0, m25 = 0, m10 = 0, m5 = 0, m1 = 0;
        N = scann.nextDouble();

        centavos = N*100;

        n100 = N / 100.0;
        N %= 100;
        n50 = N / 50.0;
        N %= 50;
        n20 = N / 20.0;
        N %= 20;
        n10 = N / 10.0;
        N %= 10;
        n5 = N / 5.0;
        N %= 5;
        n2 = N / 2.0;
        N %= 2;
        n1 = N / 1.0;
        N %= 1;
        centavos = centavos % 100;
        m50 = centavos / 50;
        centavos %= 50;
        m25 = centavos / 25;
        centavos %= 25;
        m10 = centavos / 10;
        centavos %= 10;
        m5 = centavos / 5;
        centavos %= 5;
        m1 = centavos;

        System.out.println("NOTAS:");
        System.out.println((int)n100 + " nota(s) de R$ 100.00");
        System.out.println((int)n50 + " nota(s) de R$ 50.00");
        System.out.println((int)n20 + " nota(s) de R$ 20.00");
        System.out.println((int)n10 + " nota(s) de R$ 10.00");
        System.out.println((int)n5 + " nota(s) de R$ 5.00");
        System.out.println((int)n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)n1 + " moeda(s) de R$ 1.00");
        System.out.println((int)m50 + " moeda(s) de R$ 0.50");
        System.out.println((int)m25 + " moeda(s) de R$ 0.25");
        System.out.println((int)m10 + " moeda(s) de R$ 0.10");
        System.out.println((int)m5 + " moeda(s) de R$ 0.05");
        System.out.println((int)m1 + " moeda(s) de R$ 0.01");

		scann.close();
		
	}
	
	public static void MeuCarlos() {
		
		double valor, saldo;
		double n100, n50, n20, n10, n5, n2, n1, m50,m25,m10,m01;
		
				
		valor =  576.73;
		
		System.out.println("NOTAS:");
		saldo = valor % 100.0;
		n100 =  valor / 100.0;
		System.out.println((int)n100 + " nota(s) de R$ 100.00");

		valor = saldo;
		saldo = valor % 50.0;
		n50 = valor / 50.0;
		System.out.println((int)n50 + " nota(s) de R$ 50.00");

		valor = saldo;
		saldo = valor % 20.0;
		n20 = valor / 20.0;
		System.out.println((int)n20 + " nota(s) de R$ 20.00");

		valor = saldo;
		saldo = valor % 10.0;
		n10 = valor / 10.0;
		System.out.println((int)n10 + " nota(s) de R$ 10.00");

		valor = saldo;
		saldo = valor % 5.0;
		n5 = valor / 5.0;
		System.out.println((int)n5 + " nota(s) de R$ 5.00");
		
		valor = saldo;
		saldo = valor % 2.0;
		n2 = valor / 2.0;
		System.out.println((int)n2 +" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		
		valor = saldo;
		saldo = valor % 1.0;
		n1 = valor / 1.0;
		System.out.println((int)n1 +" moeda(s) de R$ 1.00");
		
		valor = saldo;
		saldo = valor % 0.50;
		m50 = valor / 0.50;
		System.out.println((int)m50 +" moeda(s) de R$ 0.50");
		
		valor = saldo;
		saldo = valor % 0.25;
		m25 = valor / 0.25;
		System.out.println((int)m25 +" moeda(s) de R$ 0.25");
		
		valor = saldo;
		saldo = valor % 0.10;
		m10 = valor / 0.10;
		System.out.println((int)m10 +" moeda(s) de R$ 0.10");
		
		valor = saldo;
		saldo = valor % 0.01;
		m01 = valor / 0.01;
		System.out.println((int)m01 +" moeda(s) de R$ 0.01");	

	}

}

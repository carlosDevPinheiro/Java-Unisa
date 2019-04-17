import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {

		double a, b, c, d, e, f;
		int total;
		

		Scanner input = new Scanner(System.in);

		a = input.nextDouble();		
		b = input.nextDouble();		
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		total = 0;		

		input.close();
		
		if(a > 0) total ++;
		if(b > 0) total ++;
		if(c > 0) total ++;
		if(d > 0) total ++;
		if(e > 0) total ++;
		if(f > 0) total ++;	

		System.out.println(total + " valores positivos");
	}
}

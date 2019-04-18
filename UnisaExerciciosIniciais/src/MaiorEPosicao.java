import java.util.Random;

public class MaiorEPosicao {
	
	public static void main(String[] args) {
		
		 int N =100, X, highest = 0,position = 0;
	       Random rdm = new Random();
	       
	        for (int i = 1; i <= N; i++)
	        {
	            X = rdm.nextInt(1000);

	            if (highest > X)
	            {
	                highest = highest;
	                position = position;
	            }
	            else
	            {
	                highest = X;
	                position = i;
	            }

	        }
	        System.out.print(highest+"\n"+position+"\n");

	}

}

/*
 * System.out.println("posicao: " + i +" = " + nextInt);
 * System.out.println("Maior => " + maior + " Posisao => " + posicao);
 */

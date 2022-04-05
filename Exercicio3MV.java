package Familia51;
import java.util.Scanner;

public class Exercicio3MV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[][] matriz = new float[3][3];
		int linha=0,coluna=0, cont=0;
		
		Scanner leia = new Scanner(System.in);	
		
		
		for (linha=0;linha<3;linha++) 
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com um valor:");
				matriz[linha][coluna] = leia.nextFloat();
				
					if(matriz[linha][coluna] > 10)
					{
						cont++;
					}
				
		
			}
		}
		
		System.out.println("\nA quantidade de valores acima de 10 foi " +cont);
			
		

	}

}

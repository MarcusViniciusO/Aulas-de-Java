package PacoteJava2;

import java.util.Scanner;

public class Exercicio3Arrays {
	public static void main (String args[])
	{
		int [][] matriz = new int[3][3];
		int cont=0;
		
		@SuppressWarnings("resource")
		Scanner leia= new Scanner(System.in);
		System.out.println("Matriz 3x3 M[3][3]\n");
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.printf("Insira os valores da Matriz M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna]=leia.nextInt();
				if(matriz[linha][coluna]>10)
				{
					cont++;
				}
			}
		}
		System.out.println("\nTivemos "+cont+" valores maiores que 10.");
	}

}

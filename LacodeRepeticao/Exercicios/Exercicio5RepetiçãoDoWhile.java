package PacoteJava2;

import java.util.Scanner;

public class Exercicio5RepetiçãoDoWhile {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int num,soma=0;
		System.out.printf("Digite um número: ");
		num = leia.nextInt();
		
		do
		{
			if(num>0)
			{
				soma = soma + num;
			}
			System.out.printf("\nEnter com um numero: ");
			num = leia.nextInt();
		}
		while(num!=0);
		System.out.printf("O valor digitado foi de zero, sistema finalizado");
		System.out.printf("\nA soma de todos os valore digitados foi: %d",soma);
	}

}

package PacoteJava2;

import java.util.Scanner;

public class Exercicio3RepetiçãoWhile {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int idade,acumulador1=0,acumulador2=0;
		System.out.printf("Enter com a sua idade: ");
		idade = leia.nextInt();
		
		while(idade>=1 && idade<=99)
		{
			if(idade<=21)
			{
				acumulador1++;
			}
			if(idade>=50)
			{
				acumulador2++;
			}
			System.out.printf("Enter com a sua idade: ");
			idade = leia.nextInt();
		}
		System.out.printf("\nTotal de pessoas com idade inferior ou igual a 21 foi de: %d ",acumulador1);
		System.out.printf("\nTotal de pessoas com idade superior ou igual a 50 foi de: %d ",acumulador2);
	}

}

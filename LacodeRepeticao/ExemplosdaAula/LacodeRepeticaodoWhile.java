package PacoteJava2;

import java.util.Scanner;

public class LacodeRepeticaodoWhile {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int idade;
		System.out.printf("Enter com a sua idade: ");
		idade = leia.nextInt();
		
		do
		{
			System.out.printf("\nSua idade: %d",idade);
			if(idade>=18)
			{
				System.out.printf(" � maior legalmente.");
			}
			else
			{
				System.out.printf(" voc� n�o � maior de idade legalmente.");
			}
			System.out.printf("\nEnter com a sua idade: ");
			idade = leia.nextInt();
		}
		while(idade>=1);
		System.out.printf("Essa idade n�o � v�lida!!!");
	}

}


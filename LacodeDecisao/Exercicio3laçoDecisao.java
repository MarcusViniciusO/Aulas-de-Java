package PacoteJava;

import java.util.*;

public class Exercicio3la�oDecisao {
	public static void main (String args[])
	{
		Scanner ler= new Scanner(System.in);
		int idade;
		
		System.out.printf("Qual a sua idade: ");
		idade=ler.nextInt();
		ler.nextLine();
		
		if(idade>=10 && idade<=14)
		{
			System.out.printf("Classifica��o infantil");
		}
		if (idade>=15 && idade<=17)
		{
			System.out.printf("Classifica��o juvenil");
		}
		if (idade>=18 && idade<=25)
		{
			System.out.printf("Classifica��o adulto");
		}
		else
		{
			System.out.printf("Idade n�o permitida!");
		}
	}

}

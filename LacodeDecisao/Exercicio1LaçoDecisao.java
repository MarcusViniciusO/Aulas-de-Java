package PacoteJava;

import java.util.*;

public class Exercicio1LaçoDecisao {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int a,b,c;
		
		System.out.printf("Entre com o valor de A: ");
		a=ler.nextInt();
		ler.nextLine();
		System.out.printf("Entre com o valor de B:");
		b=ler.nextInt();
		ler.nextLine();
		System.out.printf("Entre com o valor de C: ");
		c=ler.nextInt();
		ler.nextLine();
		
		if(a>0 && a>b && a>c)
		{
			System.out.printf("\nO valor de A foi o maior: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.printf("\nO valor de B foi o maior: "+b);
		}
		else
		{
			System.out.printf("\nO valor de C foi o maior: "+c);
		}
	}

}

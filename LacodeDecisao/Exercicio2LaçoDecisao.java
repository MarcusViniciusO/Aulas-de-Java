package PacoteJava;

import java.util.*;

public class Exercicio2LaçoDecisao {
	public static void main (String args[])
	{
		Scanner ler= new Scanner(System.in);
		int a,b,c;
		
		System.out.printf("Entre com o primeiro valor: ");
		a=ler.nextInt();
		ler.nextLine();
		
		System.out.printf("Entre com o segundo valor: ");
		b=ler.nextInt();
		ler.nextLine();
		
		System.out.printf("Entre com o terceiro valor: ");
		c=ler.nextInt();
		ler.nextLine();
		
		if(a>b && a>c && b>c)
		{
			System.out.printf("\n Sequência 1: "+ c + b + a);
		}
		else if(b>a && b>c && a>c)
		{
			System.out.printf("\nSequência 2: "+ c + a + b);
		}
		else if (c>a && c>b && a>b)
		{
			System.out.printf("\nSequência 3: "+ b + a + c);
		}
		else if(a>c && a>b && c>b)
		{
			System.out.printf("\nSequência 4: "+ b + c+ a);
		}
		else if(b>c && b>a && c>a)
		{
			System.out.printf("\nSequência 5: "+ c + a + b);
		}
		else if(c>a && c>b && b>a)
		{
			System.out.printf("\nSequência 6: "+ a + b + c);
		}
	}

}

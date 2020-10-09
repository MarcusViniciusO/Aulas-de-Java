package PacoteJava;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String agrs[])
	{
		Scanner ler= new Scanner (System.in);
		float a,b,c,resultado;
		System.out.println("Qual foi o resultado da prova A: ");
		a=ler.nextFloat();
		
		System.out.println("Qual foi o resultado da prova B: ");
		b=ler.nextFloat();
		
		System.out.println("Qual foi o resultado da prova C: ");
		c=ler.nextFloat();
		
		resultado=((a*2)+(b*3)+(c*5))/10;
		
		System.out.println("Sua média foi de "+resultado+".");
	}

}

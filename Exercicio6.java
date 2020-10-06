package PacoteJava;

import java.util.Scanner;

public class Exercicio6 {
	public static void main (String agrs[])
	{
		Scanner ler= new Scanner (System.in);
		float d,y1,y2,x1,x2;
		
		System.out.println("Entre com o Valor de x1: ");
		x1=ler.nextFloat();
		
		System.out.println("Entre com o Valor de x2: ");
		x2=ler.nextFloat();
		
		System.out.println("Entre com o Valor de y1: ");
		y1=ler.nextFloat();
		
		System.out.println("Entre com o Valor de y2: ");
		y2=ler.nextFloat();
		
		d=(float) Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
		
		
		System.out.println("O valor da distância foi de: "+Math.round(d));
	}

}

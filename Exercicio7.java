package PacoteJava;

import java.util.Scanner;

public class Exercicio7 {
	public static void main (String agrs[])
	{
		Scanner ler = new Scanner(System.in);
		float x,y,a,b,c,d,e,f;
		
		System.out.print("Entre com o valor de A: ");
		a= ler.nextFloat();
		
		System.out.print("Entre com o valor de B: ");
		b= ler.nextFloat();
		
		System.out.print("Entre com o valor de C: ");
		c= ler.nextFloat();
		
		System.out.print("Entre com o valor de D: ");
		d= ler.nextFloat();
		
		System.out.print("Entre com o valor de E: ");
		e= ler.nextFloat();
		
		System.out.print("Entre com o valor de F: ");
		f= ler.nextFloat();
		
		x= (c*e -b*f)/(a*e-b*c);
		y= (a*f-c*d)/(a*e-b*d);
		
		System.out.println("O valor de x foi de: "+Math.round(x));
		System.out.println("O valor de y foi de: "+Math.round(y));
		
	}

}

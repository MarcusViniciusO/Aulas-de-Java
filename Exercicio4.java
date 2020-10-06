package PacoteJava;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String agrs[])
	{
		Scanner ler= new Scanner (System.in);
		float a,b,c,d,res1,res2;
		
		System.out.println("Insira o valor de A: ");
		a =ler.nextFloat();
		
		System.out.println("Insira o valor de B: ");
		b =ler.nextFloat();
		
		System.out.println("Insira o valor de C: ");
		c =ler.nextFloat();
		
		res1= (float) Math.pow((a+b), 2);
		res2= (float) Math.pow((b+c), 2);
		d=(res1+res2)/2;
		
		System.out.println("O valor de D é: "+Math.round(d)+".");
	}

}

package PacoteJava;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int anos,meses,dias;
		
		System.out.println("Quantos dias de vida você tem? ");
		anos = ler.nextInt();
		
		anos=(anos/365);
		meses=(anos%365)%12;
		dias=(anos%365)%30;
		
		System.out.println("Você tem: "+anos+" anos de vida, "+meses+" mês (es) "+dias+" dias de vida.");
	}

}

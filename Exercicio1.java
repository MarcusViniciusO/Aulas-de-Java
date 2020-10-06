package PacoteJava;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int quantos_anos,quantos_meses30,quantos_meses31,quantos_dias,meses30,meses31,resultado;
		meses30=30;
		meses31=31;
		
		System.out.println("Quantos anos você tem? ");
		quantos_anos = ler.nextInt();
		System.out.println("Quantos meses com 30 dias se passaram depois que você completou essa idade? ");
		quantos_meses30 = ler.nextInt();
		System.out.println("Quantos meses com 31 dias se passaram depois que você completou essa idade? ");
		quantos_meses31 = ler.nextInt();
		System.out.println("Quantos dias se passaram do mês atual: ");
		quantos_dias = ler.nextInt();
		
		resultado= (quantos_anos*365) + (quantos_meses30*meses30) + (quantos_meses31*meses31) + quantos_dias;
		
		System.out.println("Você tem esse resultado em dias de vida: ");
		System.out.println(resultado);
		
	}

}

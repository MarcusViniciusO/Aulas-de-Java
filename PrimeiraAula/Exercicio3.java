package PacoteJava;

import java.util.Scanner;

public class Exercico3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int totalsegundos,hora,minuto,segundo;
		
		System.out.println("Entre com o tempode de duração do evento em segundos: ");
		totalsegundos= ler.nextInt();
		
		hora=totalsegundos/3600;
		minuto=(totalsegundos%3600)/60;
		segundo=(totalsegundos%3600)%60;
		
		System.out.println(hora+" hora(s) "+minuto+" minuto(s) "+segundo+" segundo(s).");
	}
}

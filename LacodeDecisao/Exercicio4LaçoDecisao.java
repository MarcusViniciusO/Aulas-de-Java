package PacoteJava;

import java.util.Scanner;

public class Exercicio4LaçoDecisao {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		float numero, impar ,par, raiz, potencia;
		
		System.out.printf("Digite um valor qualquer: ");
		numero= ler.nextFloat();
		
		impar= numero/2;
		par= numero/2;
		
		if(numero%2==0)
		{
			raiz= (float) Math.sqrt(numero);
			System.out.printf("O seu número foi: "+numero+" ele é par, sua raiz é: %.2f",raiz,".");
		}
		else
		{
			potencia= (float) Math.pow(numero, 2);
			System.out.printf("O seu número foi: "+numero+" ele é ímpar, sua potência ao quadrado é: "+potencia+".");
		}
	}

}

package PacoteJava;

import java.util.Scanner;

public class Exercicio4La�oDecisao {
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
			System.out.printf("O seu n�mero foi: "+numero+" ele � par, sua raiz �: %.2f",raiz,".");
		}
		else
		{
			potencia= (float) Math.pow(numero, 2);
			System.out.printf("O seu n�mero foi: "+numero+" ele � �mpar, sua pot�ncia ao quadrado �: "+potencia+".");
		}
	}

}

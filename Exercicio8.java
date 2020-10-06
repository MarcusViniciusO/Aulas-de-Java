package PacoteJava;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String agrs[])
	{
		Scanner ler= new Scanner(System.in);
		float valorcarro,porcentagemfornecedor,porcentagemimposto,total;
		
		System.out.println("Qual o valor do carro? ");
		valorcarro= ler.nextFloat();
		
		porcentagemfornecedor= valorcarro*28/100;
		porcentagemimposto= valorcarro*45/100;
		
		total= valorcarro-porcentagemfornecedor-porcentagemimposto;
		
		System.out.println("seu carro custa "+ total +" com impostos mais e taxa de revenda.");
	}

}

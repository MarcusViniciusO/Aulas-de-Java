package PacoteJava2;

import java.util.Scanner;

public class Exercicio2Arrays {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner leia= new Scanner(System.in);
		
		int[] num= new int[6];
		
		for(int i=0; i<6;i++)
		{
			System.out.println("Digite o valor: ");
			num[i]=leia.nextInt();
			
		}
		System.out.printf("Os valore pares digitados foi: \n");
		int somapar=0,contimpar=0;
		for(int i=0; i<6;i++)
		{
			if(num[i]%2==0)
			{
				somapar=somapar+num[i];
				System.out.println(num[i]);
			}
			else
			{
				contimpar++;
			}
		}
		System.out.printf("\nOs valore ímpares digitados foi: \n");
		for(int i=0; i<6;i++)
		{
			if(num[i]%2==1)
			{
				System.out.println(num[i]);
			}
		}
		System.out.printf("\nA soma dos números pares foi de: "+somapar);
		System.out.println("\nA quantidade de números ímpares foi de: "+contimpar);
	}

}

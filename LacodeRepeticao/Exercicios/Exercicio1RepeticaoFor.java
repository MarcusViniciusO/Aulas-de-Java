package PacoteJava2;

public class Exercicio1RepeticaoFor {
	public static void main(String args[])
	{
		int x;
		@SuppressWarnings("unused")
		float divisao;
		System.out.printf("Os números com sobra igual a 5 dididos por 11 de 1000 até 1999 são: ");
		for(x=1000;x<=1999;x++)
		{
			divisao= x/11;
			if(x%11==5)
			{
				System.out.printf("\n %d",x);
			}
		}
	}

}

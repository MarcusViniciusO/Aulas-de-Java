package PacoteJava2;

public class Exercicio1Arrays {
	public static void main (String args[])
	{
		int []a= {1,0,5,-2,-5,7};
		
		int soma;
		soma=a[0]+a[1]+a[5];
		
		a[4]=100;
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(soma);
	}

}

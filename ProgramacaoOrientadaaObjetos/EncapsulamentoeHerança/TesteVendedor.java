package Objeto;

public class TesteVendedor {
	public static void main (String args[])
	{
		Vendedor vd = new Vendedor("Carlos","Rua Irineu, Nº 15","31254625812",945278632,30,2000,15);
		vd.imprimirInfo();
		vd.calculardeComissao();
	}

}

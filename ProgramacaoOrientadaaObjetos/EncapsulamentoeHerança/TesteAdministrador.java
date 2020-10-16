package Objeto;

public class TesteAdministrador {
	
	public static void main (String args[])
	{
		Administrador adm = new Administrador("Gilson","Rua Carlo Amatucci, Nº 125","45921845312",945821715,26,4000);
		adm.imprimirInfo();
		adm.calculardeComissao();
	}
}




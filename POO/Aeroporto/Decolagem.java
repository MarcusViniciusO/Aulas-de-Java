package Aeroporto;

public class Decolagem {
	public static void main (String args[])
	{
		Aviao aviaoDecolando = new Aviao();
		
		aviaoDecolando.companhia = "Latam";
		aviaoDecolando.modelo = "Boeing 767";
		aviaoDecolando.alturaAtual= 0;
		aviaoDecolando.alturaMaxima=4000;
		
		aviaoDecolando.decolagem();
		aviaoDecolando.subindo(5000);
		System.out.println(aviaoDecolando.alturaAtual);
		aviaoDecolando.pes();
		
	}

}

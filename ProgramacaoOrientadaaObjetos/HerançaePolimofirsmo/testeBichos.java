package Objeto;

public class testeBichos {
	
	public static void main(String args[])
	{
		cachorro cachorro1 = new cachorro();
		cachorro1.setNome("Rufus");
		cachorro1.setIdade(12);
		cachorro1.setEmitirSom("Auauau...");
		cachorro1.setAcao("Normal");
		System.out.println(cachorro1.imprimir());
		
		cavalo cavalo1 = new cavalo();
		cavalo1.setNome("Pocot�");
		cavalo1.setIdade(28);
		cavalo1.setEmitirSom("himmmrimmm");
		cavalo1.setGalopar("Trotar");
		System.out.println(cavalo1.imprimir());
		
		pregui�a pregui�a1 = new pregui�a();
		pregui�a1.setNome("Marcus");
		pregui�a1.setIdade(5);
		pregui�a1.setEmitirSom("Ai que sono!!!");
		pregui�a1.setEscalar("Sobe com as garras");
		System.out.println(pregui�a1.imprimir());
	}

}

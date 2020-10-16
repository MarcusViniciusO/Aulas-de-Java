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
		cavalo1.setNome("Pocotó");
		cavalo1.setIdade(28);
		cavalo1.setEmitirSom("himmmrimmm");
		cavalo1.setGalopar("Trotar");
		System.out.println(cavalo1.imprimir());
		
		preguiça preguiça1 = new preguiça();
		preguiça1.setNome("Marcus");
		preguiça1.setIdade(5);
		preguiça1.setEmitirSom("Ai que sono!!!");
		preguiça1.setEscalar("Sobe com as garras");
		System.out.println(preguiça1.imprimir());
	}

}

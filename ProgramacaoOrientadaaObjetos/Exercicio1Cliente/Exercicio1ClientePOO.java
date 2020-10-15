package POO;

public class Exercicio1ClientePOO {
	private String clienteUm;
	private String clienteDois;
	private String clienteTres;
	
	public Exercicio1ClientePOO (String primeiro, String segundo,String terceiro)
	{
		clienteUm=primeiro;
		clienteDois=segundo;
		clienteTres=terceiro;
	}
	public String getFiladeAtendimento()
	{
		String filadeAtendimento = clienteUm + "\n"+ clienteDois + "\n"+ clienteTres;
		return filadeAtendimento;
	}
}

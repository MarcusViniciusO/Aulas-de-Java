package Objeto;

public class pregui�a extends Animal{
	private String escalar;
	
	public pregui�a()
	{
		
	}

	public String getEscalar() {
		return escalar;
	}

	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}
	public String imprimir()
	{
		return "Nome: "+super.getNome()+"\nIdade: "+super.getIdade()
		+"\nEle emito o seguinte som: "+super.getEmitirSom()
		+"\nEle se movimenta: "+this.escalar;
	}

}

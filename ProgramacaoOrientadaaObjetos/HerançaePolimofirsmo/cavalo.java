package Objeto;

public class cavalo extends Animal {
	private String galopar;
	
	public cavalo()
	{
		
	}

	public String getGalopar() {
		return galopar;
	}

	public void setGalopar(String galopar) {
		this.galopar = galopar;
	}
	
	public String imprimir()
	{
		return "Nome: "+super.getNome()+"\nIdade: "+super.getIdade()
		+"\nEle emito o seguinte som: "+super.getEmitirSom()
		+"\nEle se movimenta: "+this.getGalopar();
	}

}

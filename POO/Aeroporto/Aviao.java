package Aeroporto;

public class Aviao {
	String companhia;
	String modelo;
	double alturaAtual;
	double alturaMaxima;
		
	void decolagem()
	{
		System.out.println("Aperte os cintos estamos decolando!!!");
	}
	void subindo(double quantidade)
	{
		double alturaSubindo = this.alturaAtual+quantidade;
		this.alturaAtual = alturaSubindo;
	}
	int pes()
	{
		if (this.alturaAtual<0)
		{
			return -1;
		}
		if(this.alturaAtual>=1000 && this.alturaAtual<2000)
		{
			return 1;
		}
		if(this.alturaAtual>=3000 && this.alturaAtual<4000)
		{
			return 2;
		}
		return 3;
	}
	

}

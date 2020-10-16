package Objeto;

public class Vendedor extends Pessoa{
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String endereco, String cpf, int telefone, int idade, double valorVendas, double comissao)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()
		+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
		+"\n"+"Endere�o: "+getEndereco()+"\n"
		+"\n"+"Conseguiu vender um valor total de "+valorVendas+" no m�s");
	}
	public void calculardeComissao() {
		double comissao = valorVendas+(valorVendas*15/100);
		System.out.println("O vendedor: "
				+getNome()+" receber�: "+comissao+"de comiss�o.");
	}
	
	public double getValorProducao() {
		return valorVendas;
	}

	public void setValorProducao(double valorVendas) 
	{
		this.valorVendas = valorVendas;
	}

	public double getComissao() 
	{
		return comissao;
	}

	public void setComissao(double comissao) 
	{
		this.comissao = comissao;
	}
	

}

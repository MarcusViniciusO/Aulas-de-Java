package Objeto;

public class Administrador extends Pessoa {
	private double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String cpf, int telefone, int idade, double ajudaDeCusto)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.ajudaDeCusto= ajudaDeCusto;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()
		+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
		+"\n"+"Endere�o: "+getEndereco()+"\n"
		+"\n"+"Valor do seu sal�rio: "+ajudaDeCusto);
	}
	public void calculardeComissao() {
		double valor_total = ajudaDeCusto+(ajudaDeCusto*15/100);
		System.out.println("O administrador: "
				+getNome()+" ter� uma ajuda de custo de 15%, sendo ent�o seu sal�rio de: "+valor_total);
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	
	
}




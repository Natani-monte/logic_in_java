package Aula13;

public class Diretor extends Cargo{
	
	public Diretor(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	private double gratificacao;

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	} 
}

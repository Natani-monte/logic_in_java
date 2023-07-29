package Aula14;

public class Diretor extends Cargo{
	private double gratificacao;
	
	public Diretor(String nome, double salario, double gratificacao) {
		super(nome, salario);
		this.gratificacao = gratificacao;
	}
	public void CalcularRendimento() {
		this.setRendimentoTotal(this.getSalario() + this.gratificacao);
		System.out.println("Rendimento Total do Diretor: " + this.getRendimentoTotal());

	}
	public double getGratificacao() {
		return this.gratificacao;
	}
}

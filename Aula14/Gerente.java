package Aula14;

public class Gerente extends Cargo{
	private double percentualBonus;
	public Gerente(String nome, double salario, double percentualBonus) {
		super(nome, salario);
		this.percentualBonus = percentualBonus;
	}
	public void CalcularRendimento() {
		this.setRendimentoTotal(this.getSalario()+ ((this.percentualBonus * this.getSalario()/100)));

		System.out.println("Rendimento Total do Gerente: " + this.getRendimentoTotal());
	}
}

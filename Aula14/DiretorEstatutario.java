package Aula14;

public class DiretorEstatutario extends Diretor {
	private double percentualLucro;

	public DiretorEstatutario(String nome, double salario, double gratificacao, double PercentualLucro) {
		super(nome, salario, gratificacao);
		this.percentualLucro = percentualLucro;
	}

	
	public void CalcularRendimento() {
		this.setRendimentoTotal(this.getSalario() + this.getGratificacao() + ((this.getSalario()* this.percentualLucro)/100));

		System.out.println("Rendimento Total do Diretor Estatutario: " + this.getRendimentoTotal());
	}
}

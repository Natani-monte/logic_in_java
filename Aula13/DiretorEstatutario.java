package Aula13;

public class DiretorEstatutario  extends Diretor{
	private double percentualDeLucro;
	public DiretorEstatutario(String nome, double salarioBase, double percentualDeLucro) {
		super(nome, salarioBase);
		this.percentualDeLucro = percentualDeLucro;
	}
	
	@Override
	public void imprimir_Relatorio() {
		System.out.println("Nome: " + this.getNome() );
		System.out.println("Salario: " + this.getSalarioBase());
		System.out.println("Percentual de Lucros: " + this.percentualDeLucro + "%");
	}
}

package Aula14;

public class Cargo {
	private String nome;
	private double salario;
	private double rendimentoTotal;
	
	public Cargo (String nome,double salario ) {
		this.nome = nome; this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getRendimentoTotal() {
		return rendimentoTotal;
	}

	public void setRendimentoTotal(double rendimentoTotal) {
		this.rendimentoTotal = rendimentoTotal;
	}

	public void CalcularRendimento() {
		
	}
}

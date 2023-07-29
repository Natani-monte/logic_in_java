package aula9;

public class Funcionario {
	private String nome;
	private int rg;
	private double salarioBase;

	public Funcionario(String nome, int rg,double salarioBase) {
		this.nome = nome;
		this.rg = rg;
		this.salarioBase = salarioBase;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRg() {
		return rg;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	
	
}

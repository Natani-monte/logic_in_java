package Aula12;

public class Cargo {
	private String nome;
	private double salarioBase;
	
	public Cargo(String nome, double salarioBase) {
		this.nome = nome; 
		this.salarioBase = salarioBase;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalarioBase (double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public void imprimir_Relatorio() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salarioBase);
	}
}

package Aula7;

public class Pessoa {
	private String nome;
	private int idade;
	private int dia;
	private int mes;
	private int ano;
	
	public Pessoa(String nome, int dia, int mes, int ano) {
		this.nome = nome; 
		this.dia =  dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void calcularIdade (int dia,int mes, int ano) {
		
		if (this.mes <= mes && this.dia <= dia) {
			this.idade = ano - this.ano;
		}
		else {
			this.idade = (ano - this.ano) - 1;
		}
	}
	public int informaIdade() {
		return this.idade;
	}
	public String informaNome() {
		return this.nome;
	}
	public void ajustaDataDeNascimento(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}

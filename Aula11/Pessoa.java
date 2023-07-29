package Aula11;

public class Pessoa {
	private String nome;
	private Pessoa mae;
	private Pessoa pai;
	public Pessoa(String nome, Pessoa mae, Pessoa pai) {
		
		this.nome = nome;
		this.mae = mae;
		this.pai = pai;
	}
	
	public Pessoa(String nome, Pessoa pai) {
		this.nome = nome;
		this.mae = null;
		this.pai = pai;
	}
	public Pessoa (String nome) {
		this.nome = nome;
		this.mae = null;
		this.pai = null;
	}
	public void verificarIgualdade(Pessoa objeto) {
		System.out.println(this.nome == objeto.getNome()&& this.mae == objeto.getMae()?"Objetos iguais" : "Objetos diferentes");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pessoa getMae() {
		return mae;
	}
	public Pessoa getPai() {
		return pai;
	}
	
	
}

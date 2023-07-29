package Objetos1;

public class Cliente {
	private String nome;
	private String cpf;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	String getNome() {
		return nome;
	}
	String getCpf() {
		return cpf;
	}
	void setCpf (String cpf) {
		this.cpf = cpf;
	}
	void setNome (String nome) {
		this.nome = nome;
	}
}

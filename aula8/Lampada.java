package aula8;

public class Lampada {
	private boolean estado;
	private int watts;
	public Lampada (boolean estado) {
		this.estado = estado;
	}
	
	public Lampada(boolean estado, int watts) {
		this.estado = estado;
		this.watts = watts;
	}
	
	public Lampada() {
		this.estado = false;
		this.watts = 60;
	}
	
	boolean getEstado() {
		return this.estado;
	}
	
} 

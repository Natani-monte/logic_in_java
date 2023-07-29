package aula8;

public class AppLampada {

	public static void main(String[] args) {
		Lampada objeto1 = new  Lampada (false);
		System.out.println(objeto1.getEstado()? "Esta ligado": "Esta desligado");
		Lampada objeto2 = new Lampada (true, 45);
		System.out.println(objeto2.getEstado()? "Esta ligado": "Esta desligado");
		Lampada objeto3 = new Lampada();
		System.out.println(objeto3.getEstado()? "Esta ligado": "Esta desligado");
	}

}

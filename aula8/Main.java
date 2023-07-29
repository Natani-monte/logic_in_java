package aula8;

public class Main {

	public static void main(String[] args) {
	
		Fruta objeto1 = new Fruta( 1,1);
		Fruta objeto2 = new Fruta (1,0);
		System.out.println( objeto2.getCaroco()> 0 ? "Tem caroco":"Não tem caroco");
		objeto2.setCaroco(1);
		System.out.println( objeto2.getCaroco()> 0 ? "Tem caroco":"Não tem caroco");
		
				
	}

}

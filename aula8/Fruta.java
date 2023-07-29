package aula8;

public class Fruta {
    private int casca;
    private int caroco;
    
    public Fruta(int casca, int caroco) {
    	this.casca = casca;
    	this.caroco = caroco;
    }
    public void retirarCaroco() {
    	if (this.caroco > 0) {
    		this.caroco = 0;
    	}
    }
    int getCasca() {
    	return this.casca;
    }
    int getCaroco() {
    	return this.caroco;
    }
    void setCaroco(int caroco) {
    	this.caroco = caroco;
    }
}
 
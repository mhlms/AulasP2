
public class Porta {

	boolean aberta;
	String cor;
	float dimensaoX;
	float dimensaoY;
	float dimensaoZ;
	
	
	
	void abre() {
		aberta = true;
	}
	
	void fecha() {
		aberta = false;
	}
	
	void pinta(String s) {
		cor = s;
	}
	
	boolean estaAberta() {
		return aberta;
	}
	
}


public class ProgramaPorta {

	public static void main(String[] args) {
		Porta porta1;
		porta1 = new Porta();
		
		porta1.aberta = true;
		porta1.cor = "marrom";
		porta1.dimensaoX = 2;
		porta1.dimensaoY = 3;
		porta1.dimensaoZ = 4;
		
		porta1.fecha();
		
		System.out.println(porta1.aberta);
		
		porta1.abre();
		
		System.out.println(porta1.aberta);
		
		System.out.println(porta1.cor);
		
		porta1.pinta("Amarelo");
		
		System.out.println(porta1.cor);
		
		porta1.pinta("Vermelho");
		
		System.out.println(porta1.cor);
		
		porta1.pinta("Azul");
		
		System.out.println(porta1.cor);
		
		System.out.println(porta1.dimensaoX);
		
		System.out.println(porta1.dimensaoY);
		
		System.out.println(porta1.dimensaoZ);
		
		porta1.dimensaoX = 3;
		porta1.dimensaoY = 4;
		porta1.dimensaoZ = 5;
		
		System.out.println(porta1.dimensaoX);
		
		System.out.println(porta1.dimensaoY);
		
		System.out.println(porta1.dimensaoZ);
		
		
		
	}

}

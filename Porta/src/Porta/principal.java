package programa2;

public class principal {

	public static void main(String[] args) {
	    casa minhaCasa = new casa("Azul");
	    
	    minhaCasa.getPorta1().abre();
	    minhaCasa.getPorta3().abre();
	    
	    System.out.println("A casa está pintada de " + minhaCasa.getCor());
	    System.out.println("Número de portas abertas: " + minhaCasa.quantasPortasEstaoAbertas());
	    
	    minhaCasa.pinta("Vermelho");
	    minhaCasa.getPorta2().abre();
	    
	    System.out.println("A casa agora está pintada de " + minhaCasa.getCor());
	    System.out.println("Número de portas abertas: " + minhaCasa.quantasPortasEstaoAbertas());
	}

	}

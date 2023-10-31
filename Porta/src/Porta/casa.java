package programa2;

public class casa {
    private String cor;
    private porta porta1;
    private porta porta2;
    private porta porta3;

    public casa(String cor) {
        this.setCor(cor);
        this.setPorta1(new porta());
        this.setPorta2(new porta());
        this.setPorta3(new porta());
    }

    public void pinta(String s) {
        this.setCor(s);
    }

    public int quantasPortasEstaoAbertas() {
        int cont = 0;
        if (getPorta1().estaAberta()) cont++;
        if (getPorta2().estaAberta()) cont++;
        if (getPorta3().estaAberta()) cont++;
        return cont;
    }

	public porta getPorta1() {
		return porta1;
	}

	public void setPorta1(porta porta1) {
		this.porta1 = porta1;
	}

	public porta getPorta3() {
		return porta3;
	}

	public void setPorta3(porta porta3) {
		this.porta3 = porta3;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public porta getPorta2() {
		return porta2;
	}

	public void setPorta2(porta porta2) {
		this.porta2 = porta2;
	}
}

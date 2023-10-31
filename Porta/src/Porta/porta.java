package programa2;

public class porta {
    private boolean aberta;

    public porta() {
        this.aberta = false;
    }

    public void abre() {
        this.aberta = true;
    }

    public void fecha() {
        this.aberta = false;
    }

    public boolean estaAberta() {
        return aberta;
    }
}
public class Macaquinho {
    private int id;
    private int qtdCocos;
    private int amigoPar;
    private int amigoImpar;

    public Macaquinho(int id, int qtdCocos, int amigoPar, int amigoImpar) {
        this.id = id;
        this.qtdCocos = qtdCocos;
        this.amigoPar = amigoPar;
        this.amigoImpar = amigoImpar;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtdCocos() {
        return this.qtdCocos;
    }

    public void setQtdCocos(int qtdCocos) {
        this.qtdCocos = qtdCocos;
    }

    public int getAmigoPar() {
        return this.amigoPar;
    }

    public void setAmigoPar(int amigoPar) {
        this.amigoPar = amigoPar;
    }

    public int getAmigoImpar() {
        return this.amigoImpar;
    }

    public void setAmigoImpar(int amigoImpar) {
        this.amigoImpar = amigoImpar;
    }

}

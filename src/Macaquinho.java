public class Macaquinho {
    private int id;
    private int qtdCocos;
    private int par;
    private int impar;

    public Macaquinho(int id, int qtdCocos, int par, int impar) {
        this.id = id;
        this.qtdCocos = qtdCocos;
        this.par = par;
        this.impar = impar;

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

    public int getPar() {
        return this.par;
    }

    public void setPar(int par) {
        this.par = par;
    }

    public int getImpar() {
        return this.impar;
    }

    public void setImpar(int impar) {
        this.impar = impar;
    }

}

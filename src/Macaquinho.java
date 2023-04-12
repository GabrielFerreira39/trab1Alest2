public class Macaquinho {
    private int id;
    private int amigoPar;
    private int amigoImpar;
    private int cocosPares;
    private int cocosImpares;

    public Macaquinho(int id, int amigoPar, int amigoImpar, int cocosPares, int cocosImpares) {
        this.id = id;
        this.amigoPar = amigoPar;
        this.amigoImpar = amigoImpar;
        this.cocosPares = cocosPares;
        this.cocosImpares = cocosImpares;
    }

    public void trocaDeCocos(Macaquinho amigoPar, Macaquinho amigoImpar) {
        amigoPar.recebeCocosPares(cocosPares);
        amigoImpar.recebeCocosImpares(cocosImpares);
        this.cocosPares = 0;
        this.cocosImpares = 0;
    }

    public void recebeCocosPares(int cocosPares) {
        this.cocosPares += cocosPares;
    }

    public void recebeCocosImpares(int cocosImpares) {
        this.cocosImpares += cocosImpares;
    }

    public int getId() {
        return this.id;
    }

    public int getQtdCocos() {
        return this.cocosPares + this.cocosImpares;
    }

    public int getAmigoPar() {
        return this.amigoPar;
    }

    public int getAmigoImpar() {
        return this.amigoImpar;
    }

    public int getCocosPares() {
        return cocosPares;
    }

    public int getCocosImpares() {
        return cocosImpares;
    }

    @Override
    public String toString() {
        return "Macaquinho vencedor é o número " + id +
                " e sua quantidade de cocos foi " + getQtdCocos();
    }
}

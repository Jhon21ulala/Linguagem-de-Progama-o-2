package adapter;

public class ElementoCircular {

    private int tamanhoRaio;

    public ElementoCircular(int tamanhoRaio) {
        this.tamanhoRaio = tamanhoRaio;
    }

    public ElementoCircular() {
        this.tamanhoRaio = 0;
    }

    public int raioAtual() {
        return tamanhoRaio;
    }
}

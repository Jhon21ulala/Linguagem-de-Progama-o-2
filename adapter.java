package adapter;

public class EncaixeCircular {

    private int limite;

    public EncaixeCircular(int limite) {
        this.limite = limite;
    }

    public int raioMaximo() {
        return limite;
    }

    public boolean aceitaCilindro(Cilindro peca) {
        int raioPeca = peca.obterRaio();
        return raioPeca <= limite;
    }
}

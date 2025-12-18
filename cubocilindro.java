package adapter;

public class ConversorCuboParaCilindro extends Cilindro {

    private Cubo origem;

    public ConversorCuboParaCilindro(Cubo origem) {
        this.origem = origem;
    }

    @Override
    public int obterRaio() {
        // metade da diagonal do quadrado da base
        double metadeDiagonal = Math.hypot(origem.obterLado(), origem.obterLado()) / 2;
        return (int) metadeDiagonal;
    }
}

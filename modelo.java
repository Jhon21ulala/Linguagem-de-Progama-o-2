package construtor_atv3;

class MontadorCidade implements Montador {

    private Veiculo veiculoAtual;

    public MontadorCidade() {
        criarNovo();
    }

    @Override
    public void iniciar() {
        criarNovo();
    }

    private void criarNovo() {
        veiculoAtual = new Veiculo();
        veiculoAtual.setCategoria("Urbano");
    }

    @Override
    public void definirMotor(String tipoMotor) {
        veiculoAtual.setMotor(tipoMotor);
    }

    @Override
    public void definirGPS(String sistemaGPS) {
        veiculoAtual.setGPS(sistemaGPS);
    }

    @Override
    public void definirPainel(String tipoPainel) {
        veiculoAtual.setPainelDigital(tipoPainel);
    }

    @Override
    public void definirAssentos(int quantidade) {
        veiculoAtual.setAssentos(quantidade);
    }

    @Override
    public Veiculo resultado() {
        return veiculoAtual;
    }
}

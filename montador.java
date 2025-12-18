package construtor_atv3;

class MontadorLuxoExecutivo implements Montador {

    private Veiculo modeloAtual;

    public MontadorLuxoExecutivo() {
        criarBase();
    }

    @Override
    public void iniciar() {
        criarBase();
    }

    private void criarBase() {
        modeloAtual = new Veiculo();
        modeloAtual.setCategoria("Executivo Longo");
    }

    @Override
    public void definirMotor(String motorSelecionado) {
        modeloAtual.setMotor(motorSelecionado);
    }

    @Override
    public void definirGPS(String gpsSelecionado) {
        modeloAtual.setGPS(gpsSelecionado);
    }

    @Override
    public void definirPainel(String painelSelecionado) {
        modeloAtual.setPainelDigital(painelSelecionado);
    }

    @Override
    public void definirAssentos(int totalAssentos) {
        modeloAtual.setAssentos(totalAssentos);
    }

    @Override
    public Veiculo resultado() {
        return modeloAtual;
    }
}


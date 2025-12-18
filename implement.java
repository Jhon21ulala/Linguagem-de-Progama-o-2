package construtor_atv3;

class MontadorFamiliaSUV implements Montador {

    private Veiculo modelo;

    public MontadorFamiliaSUV() {
        criarVeiculo();
    }

    @Override
    public void iniciar() {
        criarVeiculo();
    }

    private void criarVeiculo() {
        modelo = new Veiculo();
        modelo.setCategoria("SUV Familiar");
    }

    @Override
    public void definirMotor(String motorSelecionado) {
        modelo.setMotor(motorSelecionado);
    }

    @Override
    public void definirGPS(String gpsSelecionado) {
        modelo.setGPS(gpsSelecionado);
    }

    @Override
    public void definirPainel(String painelSelecionado) {
        modelo.setPainelDigital(painelSelecionado);
    }

    @Override
    public void definirAssentos(int totalAssentos) {
        modelo.setAssentos(totalAssentos);
    }

    @Override
    public Veiculo resultado() {
        return modelo;
    }
}

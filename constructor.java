package construtor_atv3;

class OrquestradorVeiculo {

    public void montarUrbanoSimples(Montador builder) {
        iniciarBase(builder);
        builder.definirAssentos(4);
        builder.definirMotor("1.0 Flex");
    }

    public void montarEsportivoCompacto(Montador builder) {
        iniciarBase(builder);
        builder.definirAssentos(2);
        builder.definirMotor("2.4 Turbo");
    }

    public void montarSUVFamiliar(Montador builder) {
        iniciarBase(builder);
        builder.definirAssentos(7);
        builder.definirMotor("3.0 V6");
    }

    public void montarExecutivoLuxo(Montador builder) {
        iniciarBase(builder);
        builder.definirAssentos(4);
        builder.definirMotor("2.0 Premium");
        builder.definirGPS("GPS Integrado");
        builder.definirPainel("Painel Executivo");
    }

    private void iniciarBase(Montador builder) {
        builder.iniciar();
    }
}

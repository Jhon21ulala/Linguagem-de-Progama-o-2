package construtor_atv3;

interface CriadorVeiculo {

    void iniciar();
    void configurarMotor(String motor);
    void configurarGPS(String gps);
    void configurarPainel(String painel);
    void configurarAssentos(int total);
    Veiculo resultadoFinal();
}


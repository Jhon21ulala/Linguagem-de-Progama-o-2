package construtor_atv3;

public class Sistema {

    public static void main(String[] args) {

        GerenteDeMontagem controlador = new GerenteDeMontagem();

        executarModeloUrbano(controlador);
        executarModeloEsportivo(controlador);
        executarModeloSUV(controlador);
        executarModeloExecutivo(controlador);
        executarModeloCustomizado();
    }

    private static void executarModeloUrbano(GerenteDeMontagem controlador) {
        System.out.println("\n>>> VEÍCULO URBANO <<<");
        MontadorUrbano urbano = new MontadorUrbano();
        controlador.montarUrbano(urbano);
        System.out.println(urbano.resultado());
    }

    private static void executarModeloEsportivo(GerenteDeMontagem controlador) {
        System.out.println("\n>>> VEÍCULO ESPORTIVO <<<");
        MontadorEsportivo esportivo = new MontadorEsportivo();
        controlador.montarEsportivo(esportivo);
        System.out.println(esportivo.resultado());
    }

    private static void executarModeloSUV(GerenteDeMontagem controlador) {
        System.out.println("\n>>> VEÍCULO SUV <<<");
        MontadorFamiliar suv = new MontadorFamiliar();
        controlador.montarSUV(suv);
        System.out.println(suv.resultado());
    }

    private static void executarModeloExecutivo(GerenteDeMontagem controlador) {
        System.out.println("\n>>> VEÍCULO EXECUTIVO <<<");
        MontadorExecutivo executivo = new MontadorExecutivo();
        controlador.montarExecutivo(executivo);
        System.out.println(executivo.resultado());
    }

    private static void executarModeloCustomizado() {
        System.out.println("\n>>> VEÍCULO PERSONALIZADO <<<");
        MontadorUrbano personalizado = new MontadorUrbano();
        personalizado.iniciar();
        personalizado.definirAssentos(5);
        personalizado.definirMotor("1.8 Turbo");
        personalizado.definirPainel("Painel Touch");
        personalizado.definirGPS("GPS Avançado");
        System.out.println(personalizado.resultado());
    }
}

// Clase Bicicleta
public class Bicicleta implements ImpactoEcologico {
    private String marca;
    private boolean electrica;

    public Bicicleta(String marca, boolean electrica) {
        this.marca = marca;
        this.electrica = electrica;
    }

    // Implementación del método de la interfaz
    @Override
    public double obtenerImpactoEcologico() {
        // Lógica para calcular el impacto ecológico de una bicicleta
        return electrica ? FACTOR_BICICLETA_ELECTRICA : FACTOR_BICICLETA_COMUN;
    }

}

// Clase Auto
public class Auto implements ImpactoEcologico {
    private String modelo;
    private int emisionesCO2; // en gramos por kilómetro

    public Auto(String modelo, int emisionesCO2) {
        this.modelo = modelo;
        this.emisionesCO2 = emisionesCO2;
    }

    // Implementación del método de la interfaz
    @Override
    public double obtenerImpactoEcologico() {
        // Lógica para calcular el impacto ecológico de un auto
        return emisionesCO2 * FACTOR_AUTO;
    }


}

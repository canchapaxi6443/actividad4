// Clase Edificio
public class Edificio implements ImpactoEcologico {
    private String nombre;
    private int consumoEnergia; // en kWh

    public Edificio(String nombre, int consumoEnergia) {
        this.nombre = nombre;
        this.consumoEnergia = consumoEnergia;
    }

    // Implementación del método de la interfaz
    @Override
    public double obtenerImpactoEcologico() {
        // Lógica para calcular el impacto ecológico de un edificio
        return consumoEnergia * FACTOR_EDIFICIO;
    }

}

// Interfaz ImpactoEcologico
public interface ImpactoEcologico {
    double FACTOR_EDIFICIO = 0.5;
    double FACTOR_AUTO = 0.2;
    double FACTOR_BICICLETA_COMUN = 0.1;
    double FACTOR_BICICLETA_ELECTRICA = 0.3;

    double obtenerImpactoEcologico();
}

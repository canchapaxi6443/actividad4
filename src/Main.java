import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> lista_objetos = new ArrayList<>();

        // Crear objetos de cada clase y agregarlos al ArrayList
        lista_objetos.add(new Edificio("Edificio Residecial", 22300));
        lista_objetos.add(new Auto("Xplorer", 225));
        lista_objetos.add(new Bicicleta("Bici Personal", false));

        // Iterar a través del ArrayList e invocar el método polimórfico
        for (ImpactoEcologico objeto : lista_objetos) {
            System.out.println("Objeto: " + objeto.getClass().getSimpleName());
            System.out.println("Impacto Ecológico: " + objeto.obtenerImpactoEcologico());
            System.out.println("-----------------------------");
        }
    }
}


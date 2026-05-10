/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carbonfootprints;

import java.util.ArrayList;

/**
 *
 * @author JONATHAN
 */
public class Main {
    public static void main(String[] args) {

        // Crear objetos de cada clase
        Building edificio = new Building("Torre Central", 5000, 200);
        Car carro = new Car("Toyota Corolla", 8.5, 15000);
        Bicycle bici = new Bicycle("Bicicleta Eléctrica", 3000, true);

        // Guardar en ArrayList<CarbonFootprint> (polimorfismo)
        ArrayList<CarbonFootprint> lista = new ArrayList<>();
        lista.add(edificio);
        lista.add(carro);
        lista.add(bici);

        // Iterar e invocar getCarbonFootprint() polimórficamente
        System.out.println("=== HUELLA DE CARBONO ANUAL ===\n");

        for (CarbonFootprint objeto : lista) {

            if (objeto instanceof Building b) {
                System.out.println("Edificio: " + b.getName());
            } else if (objeto instanceof Car c) {
                System.out.println("Automóvil: " + c.getModel());
            } else if (objeto instanceof Bicycle bic) {
                System.out.println("Bicicleta: " + bic.getType());
            }

            System.out.printf("   Huella de carbono: %.2f kg CO2/año%n%n",
                              objeto.getCarbonFootprint());
        }
    }
}

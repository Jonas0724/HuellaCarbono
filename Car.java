/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carbonfootprints;

/**
 *
 * @author JONATHAN
 */
public class Car implements CarbonFootprint {
    private String model;
    private double litters100kms;
    private double kmsYear;
    
    public Car (String model, double litters100kms, double kmsYear){
        this.model = model;
        this.litters100kms = litters100kms;
        this.kmsYear = kmsYear;
    }
    
    @Override
    public double getCarbonFootprint() {
        // Cálculo gasolina: 2.31 kg CO2 por litro quemado
        double littersUsed = (litters100kms / 100.0) * kmsYear;
        return littersUsed * 2.31;
    }

    public String getModel() {
        return model;
    }
    
    
}

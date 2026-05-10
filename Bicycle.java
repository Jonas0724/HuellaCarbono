/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carbonfootprints;

/**
 *
 * @author JONATHAN
 */
public class Bicycle implements CarbonFootprint{
    private String type;
    private double kmsYear;
    private boolean isElectric;
    
    public Bicycle (String type, double kmsYear, boolean isElectric) {
        this.type = type;
        this.kmsYear = kmsYear;
        this.isElectric = isElectric;
    }
    
    @Override
    public double getCarbonFootprint() {
        if (isElectric) {
            //Biclicleta eléctrica: 0.005 kg CO2 por km 
            return kmsYear * 0.005;
        }
        else {
            //Bicicleta normal: 0.021 kg por km
            return kmsYear * 0.021;
        }
    }
    
    public String getType() {
        return type;
    }
}

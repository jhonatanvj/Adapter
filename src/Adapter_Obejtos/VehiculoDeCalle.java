/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter_Obejtos;

/**
 *
 * @author jhona
 */
public class VehiculoDeCalle extends Vehiculo {
    
    public VehiculoDeCalle() {
    }

    @Override
    public String especificaciones() {
        return "Vehículo de calle \n";
    }

    @Override
    public String tipoVehiculo() {
        return "Tipo: Sedán\n";
    }

    @Override
    public String velocidadMaxima() {
        return "Velocidad máxima: 180 km/h";
    }
}

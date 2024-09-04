/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter_Obejtos;

/**
 *
 * @author jhona
 */
public class VehiculoDeCarreras extends Vehiculo {

    public VehiculoDeCarreras() {
    }

    @Override
    public String especificaciones() {
        return"Vehículo de carreras \n";
    }

    @Override
    public String tipoVehiculo() {
        return"Tipo: Fórmula 1 \n";
    }

    @Override
    public String velocidadMaxima() {
        return"Velocidad máxima: 350 km/h";
    }
}

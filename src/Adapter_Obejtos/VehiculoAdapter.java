/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter_Obejtos;

/**
 *
 * @author jhona
 */
public class VehiculoAdapter extends Target_Objetos.Target_objetos {
    private Vehiculo vehiculo;

    public VehiculoAdapter(Vehiculo vehiculo) {
        super();
        this.vehiculo = vehiculo;
    }

    @Override
    public String contratos() {
        return "Adaptando especificaciones del vehículo a contratos:\n" +
        vehiculo.especificaciones() +
        vehiculo.tipoVehiculo();
    }

    @Override
    public String supervision() {
        return "Adaptando especificaciones del vehículo a supervisión:\n"
        + vehiculo.velocidadMaxima();
    }
}

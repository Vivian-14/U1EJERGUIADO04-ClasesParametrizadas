/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Obejtos;

/**
 *
 * @author vians
 */

public class Electronico extends ProductoT<String> {
    private String garantia;

    public void setGarantia(String garantia) { this.garantia = garantia; }
    public String getGarantia() { return garantia; }

    public Electronico(String nombre, String marca, float precio, String garantia) {
        setNombre(nombre);
        setMarca(marca);
        setPrecio(precio);
        this.garantia = garantia;
    }
}

    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Obejtos;

/**
 *
 * @author vians
 * @param <T>
 */
public abstract class ProductoT <T> {
    private float precio;
    private String nombre;
    private T marca;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = (T) marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
  
    public String getNombre() {
        return nombre;
    }

    public T getMarca() {
        return marca;
    }

    public float getPrecio() {
        return precio;
    }
    
}

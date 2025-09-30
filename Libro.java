/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Obejtos;

/**
 *
 * @author vians
 */
public class Libro extends ProductoT<String> {
    private int numeroPaginas;

    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }
    public int getNumeroPaginas() { return numeroPaginas; }

    public Libro(String nombre, String marca, float precio, int numeroPaginas) {
        setNombre(nombre);
        setMarca(marca);
        setPrecio(precio);
        this.numeroPaginas = numeroPaginas;
    }
}




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Obejtos;
//ALONDRA VIANNEY HERNANDEZ TORRES GTID141

/**
 *
 * @author vians
 */
public class MainProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ProductoT p1 = new ProductoT() {};
      
   
        Libro libro1 = new Libro("Java Básico", "Editorial XYZ", 299.99f, 350);
        System.out.println("Libro: " + libro1.getNombre());
        System.out.println("Marca: " + libro1.getMarca());
        System.out.println("Precio: " + libro1.getPrecio());
        System.out.println("Número de páginas: " + libro1.getNumeroPaginas());
        
        
        Electronico electronico1 = new Electronico("Smartphone", "Samsung", 10999f, "1 añ+o");
        System.out.println("\nElectronico: " + electronico1.getNombre());
        System.out.println("Marca: " + electronico1.getMarca());
        System.out.println("Precio: " + electronico1.getPrecio());
        System.out.println("Garantía: " + electronico1.getGarantia());
    }
        
 }
    


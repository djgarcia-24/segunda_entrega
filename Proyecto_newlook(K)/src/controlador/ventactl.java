/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import modelo.Venta;

public class ventactl {
    
   private modelo.basededatos baseDatos;

   public ventactl(modelo.basededatos bd) {
        this.baseDatos =  bd;
   }    
   
   public boolean registrarVenta(String nombre, LocalDate fecha, int cantidad, String ci) {
        Venta nuevaVenta = new Venta(nombre, fecha, cantidad, ci);
        
        baseDatos.ventas.add(nuevaVenta);
        return true;
    }
   
}

package modelo;

import java.time.LocalDate;

public class Venta {
    private String nombre_producto;
    private LocalDate fecha;
    private int cantidad;
    private String CIcliente;

    public Venta(String nombre_producto, LocalDate fecha, int cantidad, String CIcliente) {
        this.nombre_producto = nombre_producto;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.CIcliente = CIcliente;
    }

    public Venta() {
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}

package modelo;

import java.time.LocalDate;
import java.util.ArrayList;


public class basededatos {
    public ArrayList<Usuario> usuarios;
    public ArrayList<Producto> productos;
    public ArrayList<Venta> ventas;
    
    public void cargarDatos() {
        // Usuarios precargados
        Usuario vendedor = new Usuario();
        vendedor.leer_datos("juan", "1234", "vendedor");
         
        Usuario encargado_almacen = new Usuario();
        encargado_almacen.leer_datos("jose", "4321", "Encargado Almacen");
        
        Usuario admin   = new Usuario();
        admin.leer_datos("joan", "567", "administrador");
        
        Usuario encargado_compras   = new Usuario();
        encargado_compras.leer_datos("jesus", "987", "encargado compras");
        
        usuarios.add(vendedor);
        usuarios.add(encargado_almacen);
        usuarios.add(admin);
        usuarios.add(encargado_compras);
        
        //productos precargados
        Producto manguera = new Producto(); 
        Producto abono = new Producto();
        Producto cerco = new Producto();
        Producto semillas = new Producto();
         
        manguera.leer_producto("manguera", "000000", "herramienta", "Marca manguera");
        manguera.leer_entrega_producto( 30, LocalDate.now() ,null );
        
        
        abono.leer_producto("abono", "000001", "agricultura",  "Marca abono" );
        abono.leer_entrega_producto( 30, LocalDate.now(), LocalDate.parse("2026-01-01"));
        abono.leer_entrega_producto( 30, LocalDate.now(), LocalDate.parse("2029-12-01"));
        abono.leer_entrega_producto( 30, LocalDate.now(), LocalDate.parse("2025-01-01"));
 
        semillas.leer_producto("semillas", "000009", "agricultura",  "Marca semillas" );
        semillas.leer_entrega_producto( 600, LocalDate.now(), LocalDate.parse("2030-01-01"));
        semillas.leer_entrega_producto( 500, LocalDate.now(), LocalDate.parse("2040-12-01"));
        
        
        
        cerco.leer_producto("cerco", "000002", "ganaderia", "Marca cerco" );
        cerco.leer_entrega_producto( 30,LocalDate.now(),null );
 
        productos.add(manguera);
        productos.add(abono);
        productos.add(cerco);
        productos.add(semillas);
    }
    
    
    public basededatos() {
        usuarios = new ArrayList<>();
        productos = new ArrayList<>();
        ventas = new ArrayList<>();
        cargarDatos();
    }    
    


    

    
}

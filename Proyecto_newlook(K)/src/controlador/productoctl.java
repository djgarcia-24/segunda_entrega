package controlador;

import modelo.Producto;
import modelo.Entrega;
import java.time.LocalDate;
import java.util.ArrayList;

public class productoctl {
    private modelo.basededatos baseDatos;
    
    public productoctl(modelo.basededatos bd) {
        this.baseDatos = bd;
    }
    
    public Producto buscar_producto(String dato_producto, String atributo) {
        Producto producto = null;
        
        for (Producto p : baseDatos.productos) {
            if (atributo.toLowerCase().equals("id") && dato_producto.equals(p.getId())) {
                producto = p;
                return producto;
            } else if (atributo.toLowerCase().equals("nombre") && dato_producto.equals(p.getNombre())) {
                producto = p;
                return producto;
            }
        }
        return producto;
    }
    
    public ArrayList<Producto> filtrar_productos(String categoria) {
        ArrayList<Producto> resultado= new ArrayList<>();
        for (Producto p : baseDatos.productos) {
            if (categoria.equals(p.getCategoria())) {
                resultado.add(p);
            }
        }
        return resultado;
        
    }
    
    public ArrayList<Producto> obtenerTodosProductos() {
        return baseDatos.productos;
    }
        
    public boolean validar_venta(Producto p, int cantidad) {
        
        if( p.getCantidad_total()-cantidad    <  p.getMinimo()){
            return false;
        }
        
        // si el producto tiene un vencimiento nulo no se comprobara para que no de error 
        if( p.entregas.get(0).vencimiento== null  ){
            for (Entrega e : p.entregas) {
            // se evalua la cantidad total
              if (p.getCantidad_total() >= cantidad) {
                return true;
              }
            }
        }else{
            // si vencimiento existe se comprueba vencimiento y cantidad
            
            for(Entrega e : p.entregas){
                if ( e.vencimiento.isAfter(LocalDate.now()) && p.getCantidad_total() >= cantidad) {
                    return true;
                }
            }
        
        } 
        
        return false;
    }
    
    public String registrar_venta(String nombreProducto, int cantidad, String ci) {
        // buscar producto
        
        Producto p = buscar_producto(nombreProducto, "nombre");
        
        
        if (p == null) {
            return "Producto no encontrado";
        }
        
        if (!validar_venta(p, cantidad)) {
            return "Venta rechazada: Producto vencido ,  bajo stock o minimo stock de " + p.getMinimo() +" alcanzado";
        }
        
        p.venta(cantidad);
        
        return "Venta aceptada\n\nProducto: " + p.getNombre() + 
               "\nCantidad vendida: " + cantidad +
               "\nCantidad restante: " + p.getCantidad_total()+
               "\nCedula de cliente: " + ci +
               "\nStock minimo: " + p.getMinimo() ;
    }
    
    public String ingresarProducto(String nombre, String id, String categoria, String proveedor,int cantidad, LocalDate ingreso, LocalDate vencimiento) {
        for (Producto p : baseDatos.productos) {
            if (p.getId().equals(id)) {
                return "Error: Ya existe un producto con el ID: " + id;
            }
            if (p.getNombre().equals(nombre)) {
                return "Error: Ya existe un producto con el nombre " + nombre;
            }
            
        }
        
        
        Producto nuevoProducto = new Producto();
        nuevoProducto.leer_producto(nombre, id, categoria, proveedor);
        nuevoProducto.leer_entrega_producto(cantidad, ingreso, vencimiento);
        
        baseDatos.productos.add(nuevoProducto);
        
        return "Producto ingresado exitosamente\n\nNombre: " + nombre + 
               "\nID: " + id +
               "\nCategoria: " + categoria +
               "\nProveedor: " + proveedor +
               "\nCantidad: " + cantidad;
    }
    
    public String editarProducto(String id, String nuevoNombre, String nuevaCategoria) {
        Producto producto = null;
        
        //busqueda de producto dado su id
        for (Producto p : baseDatos.productos) {
            if (p.getId().equals(id)) {
                producto = p;
                break;
            }
        }
        
        // verificacion si no se encontro producto
        if (producto == null) {
            return "Error: Producto con ID " + id + " no encontrado";
        }
        
        //verificacion si ya existe prodcuto con ese nombre
        for (Producto p : baseDatos.productos) {
            if (p.getNombre().toLowerCase().equals(nuevoNombre.toLowerCase()  )) {
                return "Error: Producto con nombre " + nuevoNombre + " ya existe";
            }
        }
        
        
        producto.setNombre(nuevoNombre);
        producto.setCategoria(nuevaCategoria);
        
        return "Producto editado exitosamente\n\nID: " + id + 
               "\nNuevo nombre: " + nuevoNombre +
               "\nNueva categoria: " + nuevaCategoria;
    }
    
    public Producto obtenerProducto(String dato, String criterio) {
        for (Producto p : baseDatos.productos) {
            if (criterio.toLowerCase().equals("id") && p.getId().equals(dato)) {
                return p;
            } else if (criterio.toLowerCase().equals("nombre") && p.getNombre().equals(dato)) {
                return p;
            }
        }
        return null;
    }
    
    public boolean registrarEntrega(String nombreProducto, int cantidad, LocalDate fechaEntrega, LocalDate fechaVencimiento) {
        Producto producto = null;
        
        for (Producto p : baseDatos.productos) {
            if (p.getNombre().equals(nombreProducto)) {
                producto = p;
                break;
            }
        }
        
        if (producto == null) {
            return false;
        }
        
        
        if( producto.entregas.get(0).vencimiento == null  ){
            fechaVencimiento = null;
        }
        
        producto.leer_entrega_producto(cantidad, fechaEntrega, fechaVencimiento);
        
        return true;
    }

    public void establecer_minimo(String id_poner_minimo, int minimo){
        
        for (Producto p : baseDatos.productos) {
            if (p.getId().equals(id_poner_minimo)) {
                p.setMinimo(minimo);
                break;
            }
        }
    
    }

}

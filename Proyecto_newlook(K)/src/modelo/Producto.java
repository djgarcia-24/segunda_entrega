package modelo;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;

public class Producto {
    
    private String nombre; 
    private String id;
    private String categoria;
    private int cantidad_total;
    private int minimo;
    private ArrayList<String> proveedores= new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad_total() {
        return cantidad_total;
    }

    public void setCantidad_total(int cantidad_total) {
        this.cantidad_total = cantidad_total;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public ArrayList<String> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<String> proveedores) {
        this.proveedores = proveedores;
    }

    public ArrayList<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(ArrayList<Entrega> entregas) {
        this.entregas = entregas;
    }
    
    
    
    public ArrayList<Entrega> entregas= new ArrayList<>();
    
    public void producto(){
        nombre = categoria = id="";
        cantidad_total =0 ;
        minimo = 0;
    }
    
    public void leer_producto(String nombre, String id, String categoria, String proveedor){
        this.nombre = nombre;
        this.id = id;
        this.categoria = categoria;
        proveedores.add(proveedor);
    };
    
    // se podran ordenar las entregas almacenas en el producto por fecha de vencimiento y por fecha de ingreso 
    public void ordenar_entrega_por_vencimiento(){
        if (entregas == null || entregas.size() < 2 || entregas.get(0).vencimiento == null){
            return;
        }
        
        boolean swap;
        
        LocalDate fecha_1;  
        LocalDate fecha_2; 
        
        for(int i=0 ; i< entregas.size()-1;i++ ){
            swap= false;

            for(int j =0 ; j< entregas.size()-1-i ; j++ ){
                fecha_1= entregas.get(j).vencimiento;
                fecha_2= entregas.get(j+1).vencimiento;
                
                if( fecha_1.isAfter(fecha_2)){
                    Collections.swap(entregas, j, j + 1); 
                    swap=true;
                }
                
            }               
            if(!swap) break;

        }
    }

    public void leer_entrega_producto( int cantidad_entrega, LocalDate ingreso, LocalDate vencimiento){
        int numero = this.entregas.size()+1;
        Entrega nueva_entrega = new Entrega();
        nueva_entrega.leer_datos(numero, cantidad_entrega, ingreso, vencimiento);
        this.entregas.add(nueva_entrega);
        //suma sera igual a todas las entregas sumadas sin importar el numero anterior total 
        // se asignara cant total a ese num
        
        cantidad_total=0;
        for(Entrega e: this.entregas){
            
            cantidad_total= e.cantidad_por_entrega+cantidad_total;
            
        }
    }   

    public void venta(int cantidad_vendida){
        cantidad_total = cantidad_total -cantidad_vendida;
    }


}

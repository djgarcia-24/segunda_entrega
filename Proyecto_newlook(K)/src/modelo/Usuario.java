
package modelo;


public class Usuario {
    private String id;
    private String nombre;
    private String tipo;
    
    public void leer_datos(String nombre, String id, String tipo){
        this.nombre = nombre;
        this.id = id;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

}

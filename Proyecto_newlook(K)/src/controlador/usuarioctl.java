/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Usuario;

// clase inicializa, valida registro e ingreso del usuario

public class usuarioctl {
   private modelo.basededatos baseDatos;

   public usuarioctl(modelo.basededatos bd) {
        this.baseDatos =  bd;
   }
   
    public Usuario buscar_empleado(String nombre, String clave) {
        for (Usuario u : baseDatos.usuarios) {
            if (u.getNombre().equals(nombre) && u.getId().equals(clave)){
                return u;
            }
        }
        return null;
    }
    
    public String validarIngreso(String usuario, String clave) {
        if (usuario == null || usuario.trim().isEmpty()){
           return "El Usuario es obligatorio";
        } 
        if (clave == null || clave.trim().isEmpty()){
           return "La clave es obligatoria";
        } 
        Usuario usuario_encontrado = buscar_empleado(usuario, clave);
        
        if (usuario_encontrado == null){
            return "Credenciales no validas, intente de nuevo";
        }
        else {
            return "";
        }
        
    }
    
  
    
    public String validarRegistro(String usuario, String clave, String rol) {
        if (usuario == null || usuario.trim().isEmpty()){
           return "El Usuario es obligatorio";
        } 
        if (clave == null || clave.trim().isEmpty()){
           return "La clave es obligatoria";
        } 
        if (rol == null || rol.trim().isEmpty()){
           return "El rol es obligatorio";
        } 
        
        if( buscar_empleado(usuario, clave) != null ){
           return "Usuario ya existe";
            
        }
        
        return "";
    }
    
    // matar la tanta crecion de instancias, hacer una sola con diferencia en rol
    public boolean registrarUsuario(String nombre, String clave, String rol) {
        Usuario nuevoUsuario = new Usuario();
        
        
        nuevoUsuario.leer_datos(nombre, clave, rol);
        baseDatos.usuarios.add(nuevoUsuario);
        return true;
    }
}

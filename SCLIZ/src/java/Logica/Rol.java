package Logica;

import Interfaz.IRol;
import java.util.List;

public class Rol implements IRol {

    private int idRol;
    private String nombreRol;
    private String estadoRol;
    private List<Permiso> permisos;

    public Rol() {
    }

    public Rol(int idRol, String nombreRol, String estadoRol) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.estadoRol = estadoRol;
    }
    
    @Override
        public boolean registrarRol(String nombreRol){
            
            return true;
        }
    
    @Override
    public boolean modificarEstadoRol(int idRol){
        
        return true;
    }
    
    @Override
    public boolean modificarNombreRol(int idRol, String nombreRol){
        
        return true;
    }
    
    @Override
    public List<Rol> listarRol(){
        
        return null;
    }
    
    @Override
    public Rol buscarRol(){
        
        return null;
    }
    
    @Override
    public boolean asociarPermisoARol(int idRol, Permiso permiso){
        
        return true;
    }
    
    @Override
    public boolean modificarEstadoPermisoARol(int idRol, Permiso permiso){
        
        return true;
    }

}

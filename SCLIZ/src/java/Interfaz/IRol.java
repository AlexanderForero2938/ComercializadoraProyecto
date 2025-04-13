package Interfaz;

import Logica.Permiso;
import Logica.Rol;
import java.util.List;

public interface IRol {

    public boolean registrarRol(String nombreRol);

    public boolean modificarEstadoRol(int idRol);

    public boolean modificarNombreRol(int idRol, String nombreRol);

    public List<Rol> listarRol();

    public Rol buscarRol();

    public boolean asociarPermisoARol(int idRol, Permiso permiso);

    public boolean modificarEstadoPermisoARol(int idRol, Permiso permiso);

}

package Logica;

import java.util.List;

public class Permiso {

    private int idPermiso;
    private String nombrePermiso;
    private String estadoPermiso;

    public Permiso() {
    }

    public Permiso(int idPermiso, String nombrePermiso, String estadoPermiso) {
        this.idPermiso = idPermiso;
        this.nombrePermiso = nombrePermiso;
        this.estadoPermiso = estadoPermiso;
    }

    public List<Permiso> listarPermiso() {

        return null;
    }

    public Permiso consultarPermiso() {

        return null;
    }

    public boolean modificarNombrePermiso(int idPermiso, String nombrePermiso) {

        return true;
    }

    public boolean modificarEstadoPermiso(int idPermiso) {

        return true;
    }

}

package Interfaz;

import Logica.Permiso;
import java.util.List;

public interface IPermiso {

    public List<Permiso> listarPermiso();

    public Permiso consultarPermiso();

    public boolean modificarNombrePermiso(int idPermiso, String nombrePermiso);

    public boolean modificarEstadoPermiso(int idPermiso);
}

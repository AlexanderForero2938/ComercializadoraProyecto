package Interfaz;

import Logica.Proveedor;
import java.util.List;

public interface IProveedor {

    public boolean registrarProveedor(String NITEmpresa);

    public List<Proveedor> listarProveedor();

    public boolean modificarEstadoProveedor(String NITEmpresa);

    public Proveedor buscarProveedor(String NITEmpresa);

}

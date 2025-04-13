package Logica;

import Interfaz.IProveedor;
import java.util.List;

public class Proveedor extends Empresa implements IProveedor {

    private int idProveedor;
    private String estadoProveedor;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String estadoProveedor, String NITEmpresa, String nombreEmpresa, String direccionEmpresa, String numeroContactoEmpresa) {
        super(NITEmpresa, nombreEmpresa, direccionEmpresa, numeroContactoEmpresa);
        this.idProveedor = idProveedor;
        this.estadoProveedor = estadoProveedor;
    }

    @Override
    public boolean registrarProveedor(String NITEmpresa) {

        return true;
    }

    @Override
    public List<Proveedor> listarProveedor() {

        return null;
    }

    @Override
    public boolean modificarEstadoProveedor(String NITEmpresa) {

        return true;
    }

    @Override
    public Proveedor buscarProveedor(String NITEmpresa) {

        return null;
    }

}

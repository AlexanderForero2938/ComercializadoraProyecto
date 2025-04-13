package Logica;

import Interfaz.ICliente;
import java.util.List;

public class Cliente extends Empresa implements ICliente {

    private int idCliente;
    private String correoElectronico;
    private String estadoCliente;

    public Cliente() {
    }

    public Cliente(int idCliente, String correoElectronico, String estadoCliente, String NITEmpresa, String nombreEmpresa, String direccionEmpresa, String numeroContactoEmpresa) {
        super(NITEmpresa, nombreEmpresa, direccionEmpresa, numeroContactoEmpresa);
        this.idCliente = idCliente;
        this.correoElectronico = correoElectronico;
        this.estadoCliente = estadoCliente;
    }

    public boolean registrarCliente(String NITEmpresa, String correoElectronicoCliente) {

        return true;
    }

    public List<Cliente> listarCliente() {

        return null;
    }

    public boolean modificarNumeroContactoCliente(String NITEmpresa, String numeroContactoEmpresa) {

        return true;
    }

    public Cliente buscarCliente(String NITEmpresa) {

        return null;
    }

    public boolean modificarEstadoCliente(String NITEmpresa) {

        return true;
    }

}

package Interfaz;

import Logica.Cliente;
import java.util.List;

public interface ICliente {

    public boolean registrarCliente(String NITEmpresa, String correoElectronicoCliente);

    public List<Cliente> listarCliente();

    public boolean modificarNumeroContactoCliente(String NITEmpresa, String numeroContactoEmpresa);

    public Cliente buscarCliente(String NITEmpresa);

    public boolean modificarEstadoCliente(String NITEmpresa);
}

package Logica;

import Interfaz.IEmpleado;
import java.util.List;

public class Empleado extends Persona implements IEmpleado {

    private int idEmpleado;
    private String numeroContactoEmpleado;
    private String estadoEmpleado;
    private Usuario usuario;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String numeroContactoEmpleado, String estadoEmpleado, String numeroIdentificacionPersona, String nombreTipoIdentificacionPersona, String primerNombrePersona, String segundoNombrePersona, String primerApellidoPersona, String segundoApellidoPersona) {
        super(numeroIdentificacionPersona, nombreTipoIdentificacionPersona, primerNombrePersona, segundoNombrePersona, primerApellidoPersona, segundoApellidoPersona);
        this.idEmpleado = idEmpleado;
        this.numeroContactoEmpleado = numeroContactoEmpleado;
        this.estadoEmpleado = estadoEmpleado;
    }

    @Override
    public boolean registrarEmpleado(String numeroIdentificacionPersona, String numeroContactoEmpleado) {

        return true;
    }

    @Override
    public List<Empleado> listarEmpleado() {

        return null;
    }

    public boolean modificarEmpleado(String numeroIdentificacionPersona, String numeroContactoEmpleado) {

        return true;
    }

    @Override
    public boolean modificarNumeroContactoEmpleado(String numeroIdentificacionPersona, String numeroContactoEmpleado) {

        return true;
    }

    @Override
    public Empleado buscarEmpleado(String numeroIdentificacionPersona) {

        return null;
    }
    
    @Override
    public boolean modificarEstadoEmpleado(String numeroIdentificacionPersona){
        
        return true;
    }

}

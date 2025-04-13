package Interfaz;

import Logica.Empleado;
import java.util.List;

public interface IEmpleado {

    public boolean registrarEmpleado(String numeroIdentificacionPersona, String numeroContactoEmpleado);
    
    public List<Empleado> listarEmpleado();
    
    public boolean modificarNumeroContactoEmpleado(String numeroIdentificacionPersona, String numeroContactoEmpleado);
    
    public Empleado buscarEmpleado(String numeroIdentificacionPersona);
    
    public boolean modificarEstadoEmpleado(String numeroIdentificacionPersona);
    
}

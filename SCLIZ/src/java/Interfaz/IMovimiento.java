package Interfaz;

import Logica.Movimiento;
import Logica.Producto;
import java.util.List;

public interface IMovimiento {

    public List<Movimiento> listarMovimiento();
    
    public List<Movimiento> filtrarMovimiento(Producto producto);
    
    
}

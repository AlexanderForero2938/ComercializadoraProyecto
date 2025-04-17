package Interfaz;

import java.math.BigDecimal;
import java.util.List;

public interface IProducto {

    public List<String> listarNombreProducto();
    
    public List<String> listarMarcaProducto();
    
    public List<String> listarDescripcionProducto();
    
    public List<Integer> listarIVA();
    
    public boolean modificarPrecioProducto(int idProducto, BigDecimal precioUnitarioProducto);
    
    
}

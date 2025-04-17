package Logica;

import Interfaz.IProducto;
import java.math.BigDecimal;
import java.util.List;

public class Producto implements IProducto {
    
    private int idProducto;
    private String nombreProducto;
    private String marcaProducto;
    private String descripcionProducto;
    private BigDecimal precioUnitarioProducto;
    private int IVAProducto;
    private int cantidadStockProducto;
    private String estadoProducto;

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, String marcaProducto, String descripcionProducto, BigDecimal precioUnitarioProducto, int IVAProducto, int cantidadStockProducto, String estadoProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioUnitarioProducto = precioUnitarioProducto;
        this.IVAProducto = IVAProducto;
        this.cantidadStockProducto = cantidadStockProducto;
        this.estadoProducto = estadoProducto;
    }

    @Override
    public List<String> listarNombreProducto() {

        return null;
    }

    @Override
    public List<String> listarMarcaProducto() {

        return null;
    }

    @Override
    public List<String> listarDescripcionProducto() {

        return null;
    }

    @Override
    public List<Integer> listarIVA() {

        return null;
    }
    
    @Override
    public boolean modificarPrecioProducto(int idProducto, BigDecimal precioUnitarioProducto){
        
        return true;
    }
    
    
}

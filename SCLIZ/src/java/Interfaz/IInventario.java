package Interfaz;

import Logica.Inventario;
import Logica.Producto;
import java.util.Date;
import java.util.List;

public interface IInventario {

    public boolean agragarProductoInventario(Producto producto, int cantidadProducto);

    public List<Inventario> listarInventario();

    public List<Inventario> filtrarInventario(Date fechaAperturaInventario, Date fechaCierreInventario);

    public Inventario consultarInventario(int numeroInventario);

    public boolean modificarFechaCierreInventario(int numeroInventario, Date fechaCierreInventario);

    public boolean crearInventario(Date fechaCierreInventario);

    public Producto consultarProducto(Producto producto);

    public boolean incrementarCantidadProducto(Producto producto, int cantidadProducto);

    public boolean decrementarCantidadProducto(Producto producto, int cantidadProducto);

}

package Interfaz;

import Logica.Producto;
import java.math.BigDecimal;

public interface IDetallePedido {

    public boolean agregarProducto(Producto producto);

    public BigDecimal calcularValorTotalDetallePedido(BigDecimal precioUnitarioProductoProveedor, int cantidadProducto);

    public BigDecimal calcularValorGanaciaUnitaria(BigDecimal precioUnitarioProductoProveedor, Producto producto);

    public boolean modificarCantidadDetallePedido(int idDetallePedido, int cantidadProducto);

    public boolean eliminarDetallePedido(int idDetallePedido);

    public boolean modificarValorDetallePedido(int idDetallePedido, BigDecimal valorTotalDetallePedido);

}

package Logica;

import Interfaz.IDetallePedido;
import java.math.BigDecimal;

public class DetallePedido implements IDetallePedido {

    private int idDetallePedido;
    private int cantidadProducto;
    private BigDecimal precioUnitarioProductoProveedor;
    private BigDecimal valorGananciaUnitariaProducto;
    private BigDecimal valorTotalDetallePedido;
    private String estadoDetallePedido;
    private Producto producto;

    public DetallePedido() {
    }

    public DetallePedido(int idDetallePedido, int cantidadProducto, BigDecimal precioUnitarioProductoProveedor, BigDecimal valorGananciaUnitariaProducto, BigDecimal valorTotalDetallePedido, String estadoDetallePedido, Producto producto) {
        this.idDetallePedido = idDetallePedido;
        this.cantidadProducto = cantidadProducto;
        this.precioUnitarioProductoProveedor = precioUnitarioProductoProveedor;
        this.valorGananciaUnitariaProducto = valorGananciaUnitariaProducto;
        this.valorTotalDetallePedido = valorTotalDetallePedido;
        this.estadoDetallePedido = estadoDetallePedido;
        this.producto = producto;
    }

    @Override
    public boolean agregarProducto(Producto producto) {

        return true;
    }

    @Override
    public BigDecimal calcularValorTotalDetallePedido(BigDecimal precioUnitarioProductoProveedor, int cantidadProducto) {

        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal calcularValorGanaciaUnitaria(BigDecimal precioUnitarioProductoProveedor, Producto producto) {

        return BigDecimal.ZERO;
    }

    @Override
    public boolean modificarCantidadDetallePedido(int idDetallePedido, int cantidadProducto) {

        return true;
    }

    @Override
    public boolean eliminarDetallePedido(int idDetallePedido) {

        return true;
    }

    @Override
    public boolean modificarValorDetallePedido(int idDetallePedido, BigDecimal valorTotalDetallePedido) {

        return true;
    }

}

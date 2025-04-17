package Logica;

import Interfaz.IDetalleFactura;
import java.math.BigDecimal;

public class DetalleFactura implements IDetalleFactura {

    private int idDetalleFactura;
    private int cantidadProductoDetalleFactura;
    private BigDecimal valorTotalDetalleIVA;
    private BigDecimal valorDetalleFacturaSinIVA;
    private BigDecimal valorProductoDetalleFactura;
    private int valorIVA;
    private String estadoDetalleFactura;
    private Producto producto;

    public DetalleFactura() {
    }

    public DetalleFactura(int idDetalleFactura, int cantidadProductoDetalleFactura, BigDecimal valorTotalDetalleIVA, BigDecimal valorDetalleFacturaSinIVA, BigDecimal valorProductoDetalleFactura, int valorIVA, String estadoDetalleFactura, Producto producto) {
        this.idDetalleFactura = idDetalleFactura;
        this.cantidadProductoDetalleFactura = cantidadProductoDetalleFactura;
        this.valorTotalDetalleIVA = valorTotalDetalleIVA;
        this.valorDetalleFacturaSinIVA = valorDetalleFacturaSinIVA;
        this.valorProductoDetalleFactura = valorProductoDetalleFactura;
        this.valorIVA = valorIVA;
        this.estadoDetalleFactura = estadoDetalleFactura;
        this.producto = producto;
    }
    
    

    @Override
    public boolean agregarProducto(Producto producto) {

        return true;
    }

    @Override
    public BigDecimal calcularValorTotalDetalleIVA() {

        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal calcularValorDetalleFacturaSinIVA() {

        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal calcularValorProductoDetalleFactura() {

        return BigDecimal.ZERO;
    }

    @Override
    public int valorIVAProducto() {

        return 0;
    }

    @Override
    public boolean modificarCantidadProducto(int idDetalleFactura, int cantidadProductoDetalleFactura) {

        return true;
    }

    @Override
    public boolean eliminarDetalleFactura(int idDetalleFactura) {

        return true;
    }

}

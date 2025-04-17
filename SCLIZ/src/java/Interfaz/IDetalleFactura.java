package Interfaz;

import Logica.Producto;
import java.math.BigDecimal;

public interface IDetalleFactura {

    public boolean agregarProducto(Producto producto );

    public BigDecimal calcularValorTotalDetalleIVA();

    public BigDecimal calcularValorDetalleFacturaSinIVA();

    public BigDecimal calcularValorProductoDetalleFactura();

    public int valorIVAProducto();

    public boolean modificarCantidadProducto(int idDetalleFactura, int cantidadDetalleFactura);

    public boolean eliminarDetalleFactura(int idDetalleFactura);
}

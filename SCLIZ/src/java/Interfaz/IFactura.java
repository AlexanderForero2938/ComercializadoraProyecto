package Interfaz;

import Logica.Cliente;
import Logica.DetalleFactura;
import Logica.Empleado;
import Logica.Factura;
import java.math.BigDecimal;
import java.util.List;

public interface IFactura {

    public boolean registrarFactura(Empleado empleado, Cliente cliente);
    
    public BigDecimal calcularValorTotalFactura(List<DetalleFactura> detalleFacturas);
    
    public List<Factura> listarFactura();
    
    public boolean modificarValorTotalFactura(BigDecimal valorTotalFactura);
    
    public Factura consultarFactura(Cliente cliente);
    
    public List<Factura> filtrarFactura(Cliente cliente);
    
    public boolean agregarDetalleFactura(DetalleFactura detalleFactura);
    
}

package Interfaz;

import Logica.DetallePedido;
import Logica.Gerente;
import Logica.Pedido;
import Logica.Proveedor;
import java.math.BigDecimal;
import java.util.List;

public interface IPedido {

    public boolean registrarPedido(Gerente gerente, Proveedor proveedor);
    
    public BigDecimal calcularValorTotalPedido(List<DetallePedido> detallesPedido);
    
    public List<Pedido> listarPedido();
    
    public Pedido consultarPedido(int numeroPedido);
    
    public List<Pedido> filtrarPedido(Proveedor proveedor);
    
    public boolean agregarDetallePedido(DetallePedido detallePedido);
    
    public boolean modificarValorTotalPedido(BigDecimal valorTotalPedido);
    
}

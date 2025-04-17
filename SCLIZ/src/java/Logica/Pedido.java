package Logica;

import Interfaz.IPedido;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Pedido implements IPedido{

    private int numeroPedido;
    private Date fechaRealizoPedido;
    private Date fechaLlegadaPedido;
    private BigDecimal valorTotalPedido;
    private String estadoPedido;
    private Gerente gerente;
    private List<DetallePedido> detallesPedido;
    private Proveedor proveedor;

    public Pedido() {
    }

    public Pedido(int numeroPedido, Date fechaRealizoPedido, Date fechaLlegadaPedido, BigDecimal valorTotalPedido, String estadoPedido, Gerente gerente, List<DetallePedido> detallesPedido, Proveedor proveedor) {
        this.numeroPedido = numeroPedido;
        this.fechaRealizoPedido = fechaRealizoPedido;
        this.fechaLlegadaPedido = fechaLlegadaPedido;
        this.valorTotalPedido = valorTotalPedido;
        this.estadoPedido = estadoPedido;
        this.gerente = gerente;
        this.detallesPedido = detallesPedido;
        this.proveedor = proveedor;
    }

    @Override
    public boolean registrarPedido(Gerente gerente, Proveedor proveedor) {

        return true;
    }

    @Override
    public BigDecimal calcularValorTotalPedido(List<DetallePedido> detallesPedido) {

        return BigDecimal.ZERO;
    }

    @Override
    public List<Pedido> listarPedido() {

        return null;
    }

    @Override
    public Pedido consultarPedido(int numeroPedido) {

        return null;
    }

    @Override
    public List<Pedido> filtrarPedido(Proveedor proveedor) {

        return null;
    }

    @Override
    public boolean agregarDetallePedido(DetallePedido detallePedido) {

        return true;
    }

    @Override
    public boolean modificarValorTotalPedido(BigDecimal valorTotalPedido) {

        return true;
    }

}

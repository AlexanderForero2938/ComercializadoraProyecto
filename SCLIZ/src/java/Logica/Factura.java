package Logica;

import Interfaz.IFactura;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Time;
import java.util.List;

public class Factura implements IFactura {

    private int numeroFactura;
    private Date fechaEmisionFactura;
    private Time horaEmisionFactura;
    private BigDecimal valorTotalFactura;
    private String nombreMetodoPago;
    private String estadoMetodoPago;
    private Empleado empleado;
    private Cliente cliente;
    private List<DetalleFactura> detallesFacturas;

    public Factura() {
    }

    public Factura(int numeroFactura, Date fechaEmisionFactura, Time horaEmisionFactura, BigDecimal valorTotalFactura, String nombreMetodoPago, String estadoMetodoPago, Empleado empleado, Cliente cliente) {
        this.numeroFactura = numeroFactura;
        this.fechaEmisionFactura = fechaEmisionFactura;
        this.horaEmisionFactura = horaEmisionFactura;
        this.valorTotalFactura = valorTotalFactura;
        this.nombreMetodoPago = nombreMetodoPago;
        this.estadoMetodoPago = estadoMetodoPago;
        this.empleado = empleado;
        this.cliente = cliente;
    }

    @Override
    public boolean registrarFactura(Empleado empleado, Cliente cliente) {

        return true;
    }

    @Override
    public BigDecimal calcularValorTotalFactura(List<DetalleFactura> detalleFacturas) {

        return BigDecimal.ZERO;
    }

    @Override
    public List<Factura> listarFactura() {

        return null;
    }

    @Override
    public boolean modificarValorTotalFactura(BigDecimal valorTotalFactura) {

        return true;
    }

    @Override
    public Factura consultarFactura(Cliente cliente) {

        return null;
    }

    @Override
    public List<Factura> filtrarFactura(Cliente cliente) {

        return null;
    }

    @Override
    public boolean agregarDetalleFactura(DetalleFactura detalleFactura) {

        return true;
    }

}

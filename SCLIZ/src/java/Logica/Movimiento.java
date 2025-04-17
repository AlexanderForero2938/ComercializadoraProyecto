package Logica;

import Interfaz.IMovimiento;
import java.util.Date;
import java.util.List;

public class Movimiento implements IMovimiento{

    private int idMovimiento;
    private Date fechaMovimiento;
    private String nombreMovimiento;
    private int cantidadMovimiento;
    private String estadoMovimiento;
    private Producto producto;

    public Movimiento() {
    }

    public Movimiento(int idMovimiento, Date fechaMovimiento, String nombreMovimiento, int cantidadMovimiento, String estadoMovimiento, Producto producto) {
        this.idMovimiento = idMovimiento;
        this.fechaMovimiento = fechaMovimiento;
        this.nombreMovimiento = nombreMovimiento;
        this.cantidadMovimiento = cantidadMovimiento;
        this.estadoMovimiento = estadoMovimiento;
        this.producto = producto;
    }

    @Override
    public List<Movimiento> listarMovimiento() {

        return null;
    }

    @Override
    public List<Movimiento> filtrarMovimiento(Producto producto) {

        return null;
    }
    
    
    
}

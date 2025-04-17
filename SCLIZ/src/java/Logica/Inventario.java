package Logica;

import Interfaz.IInventario;
import java.util.Date;
import java.util.List;

public class Inventario implements IInventario {

    private int numeroInventario;
    private Date fechaAperturaInventario;
    private Date fechaCierreInventario;
    private int cantidadProducto;
    private String estadoInventario;
    private List<Producto> productos;

    public Inventario() {
    }

    public Inventario(int numeroInventario, Date fechaAperturaInventario, Date fechaCierreInventario, int cantidadProducto, String estadoInventario, List<Producto> productos) {
        this.numeroInventario = numeroInventario;
        this.fechaAperturaInventario = fechaAperturaInventario;
        this.fechaCierreInventario = fechaCierreInventario;
        this.cantidadProducto = cantidadProducto;
        this.estadoInventario = estadoInventario;
        this.productos = productos;
    }

    @Override
    public boolean agragarProductoInventario(Producto producto, int cantidadProducto) {

        return true;
    }

    @Override
    public List<Inventario> listarInventario() {

        return null;
    }

    @Override
    public List<Inventario> filtrarInventario(Date fechaAperturaInventario, Date fechaCierreInventario) {

        return null;
    }

    @Override
    public Inventario consultarInventario(int numeroInventario) {

        return null;
    }

    @Override
    public boolean modificarFechaCierreInventario(int numeroInventario, Date fechaCierreInventario) {

        return true;
    }

    @Override
    public boolean crearInventario(Date fechaCierreInventario) {

        return true;
    }

    @Override
    public Producto consultarProducto(Producto producto) {

        return null;
    }

    @Override
    public boolean incrementarCantidadProducto(Producto producto, int cantidadProducto) {

        return true;
    }

    @Override
    public boolean decrementarCantidadProducto(Producto producto, int cantidadProducto) {

        return true;
    }

}

package Logica;

import Interfaz.IEmpresa;

public class Empresa implements IEmpresa{

    private String NITEmpresa;
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String numeroContactoEmpresa;

    public Empresa() {
    }

    public Empresa(String NITEmpresa, String nombreEmpresa, String direccionEmpresa, String numeroContactoEmpresa) {
        this.NITEmpresa = NITEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.numeroContactoEmpresa = numeroContactoEmpresa;
    }

    public boolean registrarEmpresa(String NITEmpresa, String nombreEmpresa, String direccionEmpresa, String numeroContactoEmpresa) {

        return true;
    }

}

package Logica;

import Interfaz.IGerente;

public class Gerente extends Persona implements IGerente {

    private int idGerente;
    private String estadoGerente;
    private Usuario usuario;

    public Gerente() {
    }

    public Gerente(int idGerente, String estadoGerente, String numeroIdentificacionPersona, String nombreTipoIdentificacionPersona, String primerNombrePersona, String segundoNombrePersona, String primerApellidoPersona, String segundoApellidoPersona) {
        super(numeroIdentificacionPersona, nombreTipoIdentificacionPersona, primerNombrePersona, segundoNombrePersona, primerApellidoPersona, segundoApellidoPersona);
        this.idGerente = idGerente;
        this.estadoGerente = estadoGerente;
    }

    @Override
    public boolean registrarGerente(String numeroIdentificacionPersona) {

        return true;
    }

    @Override
    public boolean modificarEstadoGerente(String numeroIdentificacionPersona) {

        return true;
    }

    @Override
    public Gerente buscarGerente(String numeroIdentificacionPersona) {

        return null;
    }

}

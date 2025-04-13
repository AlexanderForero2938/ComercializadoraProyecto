package Logica;

import Interfaz.IPersona;

public class Persona implements IPersona {

    private String numeroIdentificacionPersona;
    private String nombreTipoIdentificacionPersona;
    private String primerNombrePersona;
    private String segundoNombrePersona;
    private String primerApellidoPersona;
    private String segundoApellidoPersona;

    public Persona() {
    }

    public Persona(String numeroIdentificacionPersona, String nombreTipoIdentificacionPersona, String primerNombrePersona, String segundoNombrePersona, String primerApellidoPersona, String segundoApellidoPersona) {
        this.numeroIdentificacionPersona = numeroIdentificacionPersona;
        this.nombreTipoIdentificacionPersona = nombreTipoIdentificacionPersona;
        this.primerNombrePersona = primerNombrePersona;
        this.segundoNombrePersona = segundoNombrePersona;
        this.primerApellidoPersona = primerApellidoPersona;
        this.segundoApellidoPersona = segundoApellidoPersona;
    }

    @Override
    public boolean registrarPersona(String numeroIdentificacionPersona, String nombreTipoIdentificacionPersona, String primerNombrePersona, String segundoNombrePersona, String primerApellidoPersona, String segundoApellidoPersona) {

        return true;
    }

}

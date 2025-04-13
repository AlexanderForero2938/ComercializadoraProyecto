package Interfaz;

import Logica.Gerente;

public interface IGerente {

    public boolean registrarGerente(String numeroIdentificacionPersona);

    public boolean modificarEstadoGerente(String numeroIdentificacionPersona);

    public Gerente buscarGerente(String numeroIdentificacionPersona);

}

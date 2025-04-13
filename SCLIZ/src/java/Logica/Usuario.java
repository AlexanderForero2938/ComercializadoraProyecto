package Logica;

import Interfaz.IUsuario;

public class Usuario implements IUsuario {

    private int idUsuario;
    private String nombreUsuario;
    private String contrasenaUsuario;
    private String estadoUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String contrasenaUsuario, String estadoUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.estadoUsuario = estadoUsuario;
    }

    @Override
    public boolean registrarUsuario(String nombreUsuario, String contrasenaUsuario) {

        return true;
    }

    @Override
    public boolean modificarContrasena(int idUsuario, String contrasenaUsuario, String contrasenaNueva, String verificacionContrasenaNueva) {

        return true;
    }

    @Override
    public boolean encriptarContrasena(String contrasenaUsuario) {

        return true;
    }

}

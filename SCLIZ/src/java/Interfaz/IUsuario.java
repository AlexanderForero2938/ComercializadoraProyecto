package Interfaz;

public interface IUsuario {

    public boolean registrarUsuario(String nombreUsuario, String contrasenaUsuario);

    public boolean modificarContrasena(int idUsuario, String contrasenaUsuario, String contrasenaNueva, String verificacionContrasenaNueva);

    public boolean encriptarContrasena(String contrasenaUsuario);
}

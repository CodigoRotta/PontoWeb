package control;
import model.Usuario;
import model.dao.UsuarioDao;

/**
 *
 * @author Richard e Derick
 */
public class ControleUsuario {
    // Atributos
    
    // Métodos
   public String logar(String ra, String senha) throws ClassNotFoundException {
    Usuario usuario = new Usuario();
    usuario.setRa(ra);
    usuario.setSenha(senha);

    UsuarioDao usuarioDAO = new UsuarioDao();
    return usuarioDAO.validarLogin(usuario);
}

}

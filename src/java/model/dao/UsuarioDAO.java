
package model.dao;

import javax.enterprise.context.Dependent;

import model.entity.Usuario;

/**
 *
 * @author Erick Danilo Regis
 */
@Dependent
public class UsuarioDAO extends BaseDao<Usuario> {
   
   public Usuario logar(String email, String senha) {

        try {
            return (Usuario) getEntityManager().createNamedQuery("Usuario.logar").setParameter("email", email).setParameter("senha", senha).getSingleResult();
        } catch (Exception e) {
            System.out.println("erro: " + e.getLocalizedMessage());
            return null;
        }
    }

    public Usuario logar(String email, Integer senha) {
        try {
            return (Usuario) getEntityManager().createNamedQuery("Usuario.logar").setParameter("email", email).setParameter("senha", senha).getSingleResult();
        } catch (Exception e) {
            System.out.println("erro: " + e.getLocalizedMessage());
            return null;
        }
    }
   
}

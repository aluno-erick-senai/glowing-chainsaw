
package controller.bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import model.dao.UsuarioDAO;
import model.entity.Usuario;


/**
 *
 * @author Erick Danilo Regis
 */
@Named(value = "usuarioB")
@RequestScoped
public class UsuarioB {
 
     @Inject
    private UsuarioDAO usuarioDAO;
    private Usuario usuario;
     
    private Integer id;
    private String nome;
    private String email;
    private String cpf;
    private String senha;
    private String cep;
    private String numero;
    private Boolean administrador;
     
    public void salvarusuario(){
        
        Usuario u = new Usuario();
        
      u.setId(id);
      u.setNome(nome);
      u.setCpf(cpf);
      u.setCpf(cpf);
      u.setEmail(email);
      u.setSenha(senha);
      u.setAdministrador(false);
     
      usuarioDAO.save(u);
        
      
    }
    
    public String logar(){
        
        usuario = usuario.logar(email, senha);
        
       if (usuario == null)
       {
           return "loginAdmin";
       }               
               
        
    return"detalhesProdutoDois?faces-redirect=true";
    }
                 // o ?faces-redirect=true serve para a tualizar a pagina sem sair.

    public UsuarioB() {
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the administrador
     */
    public Boolean getAdministrador() {
        return administrador;
    }

    /**
     * @param administrador the administrador to set
     */
    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }
    
}

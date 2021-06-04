
package controller.bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Guilherme Lange 
 */
@Named(value = "barracoMb")
@RequestScoped
public class barracoMb {

    
    public barracoMb() {
    }
    public String getPaginaLogin(){
        return "loginUsuario";
    }
    public String getPaginaCadastro(){
        return "Cadastro";
    }
    public String getPaginaBase(){
        return "paginaInicial";
    }
    public String getPaginaComprar(){
        return "carrinho";
    }
    public String getPaginaInfo(){
        return "detalhesProdutoUm";
    }
    public String getPaginaProd(){
        return "detalhesProdutoDois";
    }
    public String getPaginaProd3(){
        return "detalhesProdutoTres";
    }
}

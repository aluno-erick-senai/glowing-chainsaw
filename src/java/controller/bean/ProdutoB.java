
package controller.bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import model.dao.ProdutoDAO;
import model.entity.Produto;

/**
 *
 * @authorErick Danilo Regis
 */
@Named(value = "produtoB")
@RequestScoped
public class ProdutoB {

    @Inject
    private ProdutoDAO produtoDAO;

    private Integer id;
    private String nome;
    private String descricao;
    private String foto;

    public void salvarProduto() {
       
        Produto p = new Produto();

        p.setId(id);
        p.setNome(nome);
        p.setDescricao(descricao);
        p.setPreco(Double.NaN);

        produtoDAO.salvar(p);
    }

    public ProdutoB() {

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

}

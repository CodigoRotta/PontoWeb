
package model;

/**
 *
 * @author Richard e Derick
 */
public class Usuario {
    // Atributos
    private String ra;
    private String senha;
    private String nome;
    private String acesso;
    private String setor;
    
    //Métodos
    public String getRa() {
        return this.ra;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
   
}

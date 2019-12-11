
package cadastro;


public class cadastro {
    
    private int codigo;
    private String nome;
    private String usuario;
    private String senha;
    private String pesquisa;

    
    public String getPesquisa() {
        return pesquisa;
    }

   
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    
    public int getCodigo() {
        return codigo;
    }

    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   
    
   public String getNome() {
       return nome;
    }

   
   public void setNome(String nome) {
       this.nome = nome;
   }

   
   
    public String getUsuario() {
        return usuario;
    }

    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   
    public String getSenha() {
        return senha;
    }

   
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}

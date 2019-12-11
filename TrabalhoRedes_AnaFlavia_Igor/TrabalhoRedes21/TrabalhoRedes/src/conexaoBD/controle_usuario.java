
package conexaoBD;

import cadastro.cadastro;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class controle_usuario {
    
    conexaoBD conex = new conexaoBD();
    cadastro cad = new cadastro();
    
    public void Salvar(cadastro cad){ // Grava no Banco de dados
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cadastro (nome,usuario,senha) values(?,?,?)"); 
            pst.setString(1,cad.getNome());
            pst.setString(2,cad.getUsuario());
            pst.setString(3,cad.getSenha());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso !");
                       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar !\nErro:"+ex);
        }
        
        conex.desconecta();
    }
    
    public void Excluir (cadastro cad){ // Exclui no Banco de dados
        conex.conexao();
        
        try { 
            PreparedStatement pst = conex.con.prepareStatement("delete from cadastro where codigo=?");
            pst.setInt(1, cad.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir !\nErro:"+ex);
        }
        
        
        conex.desconecta();
    }
    public cadastro buscausuario(cadastro cad) { // Realiza a pesquisa de um usúario
        conex.conexao();
        conex.executaSql("select *from cadastro where nome like '%"+cad.getPesquisa()+"%'");
        try {
            conex.rst.first();
            cad.setCodigo(conex.rst.getInt("codigo"));
            cad.setNome(conex.rst.getString("nome"));
            cad.setUsuario(conex.rst.getString("usuario"));
            cad.setSenha(conex.rst.getString("senha"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na pesquisa !\nErro:"+ex);
        }
        
        conex.desconecta();
        return cad;
}
}

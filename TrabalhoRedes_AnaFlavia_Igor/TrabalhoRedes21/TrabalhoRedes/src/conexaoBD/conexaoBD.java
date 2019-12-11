
package conexaoBD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class conexaoBD {
    
    public Statement stm;
    public ResultSet rst;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/projetoredes";
    private String usuario = "postgres";
    private String senha = "123456";
    public Connection con;
    
    public void conexao(){ // Responsável por realizar a conexão no BD
   
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(conexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados:\n" +ex.getMessage());
        }
    }
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rst.TYPE_SCROLL_INSENSITIVE,rst.CONCUR_READ_ONLY);
            rst = stm.executeQuery( sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro SQL\n" +ex.getMessage());
        }
    }
    public void desconecta() {
        try {
            con.close();
           // JOptionPane.showMessageDialog(null, "Conexão encerrada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desconectar:\n"+ex.getMessage());
        }
    }
}

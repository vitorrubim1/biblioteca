package conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class bd {
    
    // Declaração de parametros
    private final String driver = "com.mysql.jdbc.Driver";
    private final String database = "biblioteca";
    private final String url = "jdbc:mysql://127.0.0.1:3306/biblioteca";
    private final String username = "root";
    private final String password = "";
    public Statement stm;
    public ResultSet rs;
    public Connection conex = null;
    
    public void conecta(){
        try{
            System.setProperty("jdbc.Drivers", driver);
            conex = DriverManager.getConnection(url, username, password);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "O Banco de Dados não foi localizado! ESSSSSS "+ex.toString());
        }
    }
    
    public void executaSQL(String sql){
        try{
            stm = conex.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro! Executa SQL: \n "+ex.getMessage());
        }
    }
    
    public void desconecta(){
        try{
            conex.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao desconectar do Banco de Dados! "+ ex.toString());
        }
    }
    
}

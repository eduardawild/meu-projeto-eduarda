
import dao.Conexão;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TesteBancodeDados {

    public static void main(String[] args) {
        inserir();
        
    }
   
    public static void inserir()
    {
        String sql;
        
        String login, senha, email;
        login = JOptionPane.showInputDialog("Informe o login: ");
        senha = JOptionPane.showInputDialog("Informe a senha: ");
        email = JOptionPane.showInputDialog("Informe o email: ");
        
        sql = "INSERT INTO jogador (login, senha, email)" + 
                "VALUES ('"+login+"' + '"+senha+"' + '"+email+"')";
        
        PreparedStatement pst = Conexão.getPreparedStatement(sql);
        
        try 
        {
            pst.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(TesteBancodeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Aviao;

public class AviaoDAO {
    
    public Boolean inserir (Aviao aviao)
    {
        Boolean retorno;
        
        String sql = "INSERT INTO aviao (numero, saida, chegada, paradas) VALUES (?, ?, ?, ?)";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try
        {
            pst.setInt(1, aviao.getNumero());
            pst.setString(2, aviao.getSaida());
            pst.setString(3, aviao.getChegada());
            pst.setInt(4, aviao.getParadas());
            
            pst.executeUpdate();
            retorno = true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }
    
    public List<Aviao> listar ()
    {
        List<Aviao> lista = new ArrayList<Aviao>();
        
        String sql = "SELECT * FROM aviao";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try
        {
            ResultSet res = pst.executeQuery();
            
            while (res.next())
            {
                Aviao aviao = new Aviao();
                
                aviao.setNumero(res.getInt("numero"));
                aviao.setSaida(res.getString("saida"));
                aviao.setChegada(res.getString("chegada"));
                aviao.setParadas(res.getInt("paradas"));
                lista.add(aviao);
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(AviaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public Boolean remover (Aviao aviao)
    {
        Boolean retorno;
        
        String sql = "DELETE FROM aviao WHERE numero = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            pst.setInt(1, aviao.getNumero());
            
            pst.executeUpdate();
            retorno = true;
        }
        catch (Exception ex)
        {
            retorno = false;         
        }
        return retorno;
    }
}


import petshop.GUI.ConexaoPostgreSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author matheus
 */
public class Teste {
    
    
    
    public static void main(String[] args) {
        Statement query = ConexaoPostgreSQL.openConnectionPostgreSQL();
        
        try {
            ResultSet rs =  query.executeQuery("SELECT id, login, senha, nivel FROM \"Usuario\";");
            
            while (rs.next()){
                System.out.println("Login: " + rs.getString("login")+" Senha: " + rs.getString("senha")+" Nivel de acesso: " + rs.getString("nivel"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

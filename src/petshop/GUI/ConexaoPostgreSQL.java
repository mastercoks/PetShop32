package petshop.GUI;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class ConexaoPostgreSQL {

//    Argumentos do drive de conexão
    public static Statement openConnectionPostgreSQL() {

        String url = "jdbc:postgresql://localhost:5432/PetShop";
        String usuario = "postgres";
        String senha = "123";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, usuario, senha);
//            Cria uma variavel Statement
            return con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados ", "ERRO", JOptionPane.ERROR_MESSAGE, null);

        }
        return null;
    }
}

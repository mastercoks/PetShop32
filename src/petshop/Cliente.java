
package petshop;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matheus
 */
public class Cliente extends Pessoa{
    
    private ResultSet rs;
    
//      Construtor de Cliente
    public Cliente(String nome, String cpf, String telefone, Date dataNasc, String sexo){
        super(nome, cpf, telefone, dataNasc, sexo);       
    }
    
//      toString de Cliente para imprimir os dados
    @Override
    public String toString() {
        
        DateFormat data = DateFormat.getDateInstance();
        return "Nome: " + getNome()+ " \nCPF: " + getCpf() + " \nTelefone: "
                + getTelefone() + " \nData de Nascimento : " + data.format(getDataNasc())
                + " \nSexo: " + getSexo();
    }
    


}

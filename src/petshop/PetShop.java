/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class PetShop {

	/**
	 * @param args
	 *            the command line arguments
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws SQLException {

		// Listas
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		ArrayList<Animal> animais = new ArrayList<>();
		ArrayList<Adm> admins = new ArrayList<>();
		ArrayList<TipoServico> exames = new ArrayList<>();
		ArrayList<TipoServico> servicos = new ArrayList<>();
		ArrayList<TipoServico> cirurgias = new ArrayList<>();
                Date dLaherce = new Date(93, 3, 18);
		Date dRaveni = new Date(94, 2, 19);
                
                Cliente raveni = new Cliente("Raveni", "422.145.678-90",
				"(77) 9985-7271", dRaveni, "Feminino");
		clientes.add(raveni);
		Cliente laherce = new Cliente("-Laherce", "012.345.678-90",
				"(77) 9985-2316", dLaherce, "Masculino");
		clientes.add(laherce); 

		
	}
}

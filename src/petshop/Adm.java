package petshop;

import java.util.ArrayList;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public class Adm extends Funcionario {

	// Construtor
	public Adm(String login, String senha) {
		super(null, null, null, null, null, login, senha);
	}
        
	// toString de Admin para imprimir os dados
	@Override
	public String toString() {
		return "Login: " + getLogin()
				+ "\nSenha: " + getSenha();
	}
}

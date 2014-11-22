package br.edu.uesb.petshop;

import java.text.DateFormat;
import java.util.Date;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matheus
 */
public class Funcionario extends Pessoa {

	// Atributos de Funcionario
	private String login;
	private String senha;

	// Construtor de Funcionario
	public Funcionario(String nome, String cpf, String telefone, Date dataNasc,
			String sexo, String login, String senha) {
		super(nome, cpf, telefone, dataNasc, sexo);
		this.login = login;
		this.senha = senha;
	}

	// Metodo para buscar Cliente
	public String[] buscarCliente(ArrayList<Cliente> clientes) {
		String[] bCliente = new String[clientes.size()];

		for (int i = 0; i < clientes.size(); i++) {
			bCliente[i] = clientes.get(i).getNome();
		}
		return bCliente;
	}

	// Metodo para buscar Animal
	public String[] buscarAnimal(ArrayList<Animal> animais) {
		String[] bAnimal = new String[animais.size()];
		for (int i = 0; i < animais.size(); i++) {
			bAnimal[i] = animais.get(i).getNomeAnimal();
		}
		return bAnimal;
	}

	// Metodo para Logar no sistema
	public Funcionario logar(String login, String senha) {
		Funcionario funcionario = buscarbyLogin(login, null);
		if (funcionario != null) {
			if (funcionario.equals(checarSenha(senha))) {
				return funcionario;
			}
		}
		return null;
	}

	// Metodo para buscar o login e ver se ele � v�lido
	private Funcionario buscarbyLogin(String login,
			ArrayList<Funcionario> funcionarios) {
            for (Funcionario funcionario1 : funcionarios) {
                Funcionario funcionario = (Funcionario) funcionario1;
                if (funcionario.equals(login)) {
                    return funcionario;
                }
            }
		return null;
	}

	// Sets e Gets

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	// Metodo para checar a senha
	public boolean checarSenha(String senha) {
		return this.senha.equals(senha);
	}

	// toString de Funcionario para imprimir os dados
	@Override
	public String toString() {

		DateFormat data = DateFormat.getDateInstance();
		return "Nome: " + getNome() + " \nCPF: "
				+ getCpf() + " \nTelefone: " + getTelefone()
				+ " \nData de Nascimento : " + data.format(getDataNasc())
				+ " \nSexo: " + getSexo() + "\nLogin: " + getLogin()
				+ "\nSenha: " + getSenha();
	}
}

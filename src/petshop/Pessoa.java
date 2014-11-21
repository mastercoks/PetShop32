package petshop;


import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public abstract class Pessoa {
    
//      Atributos de Pessoa
    private String nome;
    private String cpf;
    private String telefone;
    private Date dataNasc;
    private String sexo;
    
//      Construtor de Pessoa
    public Pessoa(String nome, String cpf, String telefone, Date dataNasc, String sexo){
       
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.sexo = sexo;
}
//      Sets e Gets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public String getSexo() {
        return sexo;
    }
    
    
}

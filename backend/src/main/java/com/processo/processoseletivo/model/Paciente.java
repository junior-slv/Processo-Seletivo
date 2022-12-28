package com.processo.processoseletivo.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Paciente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)

    private Long id;
    private String nome;
    private String sexo;
    private String rua;
    private int numero;
    private String bairro;
    private String estado;
    private String cidade;
    private String email;
    private String celular;
    private int datanascimento;
    @Column(nullable = false, updatable = false)
    private String pacienteCodigo;

    private String cpf;

    public Paciente(){}

    public Paciente (Long id, String nome, String sexo, String rua, int numero, String bairro, String estado,
                     String cidade, String cpf, String celular, int datanascimento, String email, String pacienteCodigo){
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.cpf = cpf;
        this.celular = celular;
        this.datanascimento = datanascimento;
        this.email = email;
        this.pacienteCodigo = pacienteCodigo;

    }


    /*GET*/
    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getSexo(){
        return sexo;
    }
    public String getRua(){
        return nome;
    }
    public int getNumero(){
        return numero;
    }
    public String getBairro(){
        return bairro;
    }
    public String getEstado(){
        return estado;
    }
    public String getCidade(){
        return cidade;
    }
    public String getCpf(){
        return cpf;
    }
    public String getCelular(){
        return celular;
    }
    public int getDatanascimento(){
        return datanascimento;
    }
    public String getEmail(){
        return email;
    }
    public String getPacienteCodigo(){
        return pacienteCodigo;
    }

    /*SET*/
    public void setId(Long id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setBairror(String bairro){
        this.bairro = bairro;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setCelular(String celular){
        this.celular = celular;
    }
    public void setDatanascimento(int datanascimento){
        this.datanascimento = datanascimento;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPacienteCodigo(String pacienteCodigo){
        this.pacienteCodigo = pacienteCodigo;
    }
    @Override
    public String toString(){
        return "Paciente{"+
                "Id="+ id +
                ", Nome="+ nome + '\'' +
                ", CPF=' " + cpf + '\'' +
                ", Email=' " + email + '\''+
                ", Telefone=' " + celular + '\'' +
                ", Sexo=' " + sexo + '\'' +
                ", Data de nascimento=' " + datanascimento + '\'' +
                ", Endereco=' " +rua+", "+numero+" - "+bairro+", "+cidade+" - "+estado + '\''+
                '}';


    }
}

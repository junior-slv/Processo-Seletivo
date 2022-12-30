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

    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;

    private String email;
    private String sexo;
    private String telefone;
    private String cpf;
    @Column(nullable = false, updatable = false)
    private String pacienteCodigo;



    public Paciente(){}

    public Paciente (Long id, String nome, String rua, String numero, String bairro, String cidade, String estado, String sexo, String cpf, String telefone, String email, String pacienteCodigo){
        this.id = id;
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.sexo = sexo;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.pacienteCodigo = pacienteCodigo;

    }


    /*GET*/
    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }

    public String getRua(){
        return rua;
    }
    public String getNumero(){
        return numero;
    }
    public String getBairro(){
        return bairro;
    }
    public String getCidade(){
        return cidade;
    }
    public String getEstado(){
        return estado;
    }
    public String getSexo(){
        return sexo;
    }
    public String getTelefone(){
        return telefone;
    }

    public String getCpf(){
        return cpf;
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
    public void setRua(String rua){
        this.rua = rua;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
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
                ", Rua="+ rua + '\'' +
                ", Numero="+ numero + '\'' +
                ", Bairro="+ bairro + '\'' +
                ", Cidade="+ cidade + '\'' +
                ", Estado="+ estado + '\'' +
                ", Telefone=' " + telefone + '\'' +
                ", Sexo=' " + sexo + '\'' +
                '}';


    }
}

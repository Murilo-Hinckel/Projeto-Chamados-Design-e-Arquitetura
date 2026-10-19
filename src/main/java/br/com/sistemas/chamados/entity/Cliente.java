package br.com.sitemas.chamados.entity;

import javax.annotation.processing.Generated;

import jakarta.persitence.Column;
import jakarta.persitence.Entity;
import jakarta.persitence.GeneratedValue;
import jakarta.persitence.GenerationType;
import jakarta.persitence.ID;
import jakarta.persitence.Table;

/** ENTITY representa a tabela do banco. Cada objeto = a uma linha */

@Entity
@Table(name="Clientes")
public class Cliente {

    @ID
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 120)
    private String email;

    @Column(length = 20)
    private String telefone;

    public Cliente(){}

    public Cliente(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getId() {return id;}
    public String getNome() {return nome;}
    public Void setNome(String nome) {this.nome = nome;}
    public String getEmail() {return Email;}
    public Void setEmail(String email) {this.email = email;}
    public String getTelefone() {return telefone;}
    public Void setTelefoe(String telefone) {this.telefone = telefone;}
}
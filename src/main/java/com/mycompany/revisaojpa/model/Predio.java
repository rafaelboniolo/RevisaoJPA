/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.revisaojpa.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author a1808338
 */
@Entity(name = "tb_predio")
public class Predio {
    
    @Id
    @GeneratedValue
    private long id_predio;
    private String descricao;
    private String numero;
    
    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;
    
    @ManyToOne
    @JoinColumn(name = "id_bairro")
    private Bairro bairro;
    
    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;
    
    @OneToMany(mappedBy = "predio", fetch = FetchType.EAGER)
    private List<Patrimonio> patrimonios;


    public long getId_predio() {
        return id_predio;
    }

    public void setId_predio(long id_predio) {
        this.id_predio = id_predio;
    }
    
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Patrimonio> getPatrimonios() {
        return patrimonios;
    }

    public void setPatrimonios(List<Patrimonio> patrimonios) {
        this.patrimonios = patrimonios;
    }
    
    
    
    
}

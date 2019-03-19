/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.revisaojpa.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author a1808338
 */
@Entity(name = "tb_patrimonio")
public class Patrimonio {
    @Id
    @GeneratedValue
    private long codigo;
    private String descricao;
    private Date datafabricacao;
    private Date dataaquisicao;
    private Date dataeliminacao;
    private double vlraquisicao;
    private String obs;
    private String localizacao;
    
    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private Tipo tipo;
    
    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Marca marca;
    
    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;
    
    @ManyToOne
    @JoinColumn(name = "id_predio")
    private Predio predio;
    
    
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDatafabricacao() {
        return datafabricacao;
    }

    public void setDatafabricacao(Date datafabricacao) {
        this.datafabricacao = datafabricacao;
    }

    public Date getDataaquisicao() {
        return dataaquisicao;
    }

    public void setDataaquisicao(Date dataaquisicao) {
        this.dataaquisicao = dataaquisicao;
    }

    public Date getDataeliminacao() {
        return dataeliminacao;
    }

    public void setDataeliminacao(Date dataeliminacao) {
        this.dataeliminacao = dataeliminacao;
    }

    public double getVlraquisicao() {
        return vlraquisicao;
    }

    public void setVlraquisicao(double vlraquisicao) {
        this.vlraquisicao = vlraquisicao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }
    
    
}

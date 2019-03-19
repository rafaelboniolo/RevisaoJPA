/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.revisaojpa.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author a1808338
 */
@Entity(name = "tb_marca")
public class Marca {
    @Id
    @GeneratedValue
    private long id_marca;
    private String descricao;
    
    
    @OneToMany(mappedBy = "marca")
    private List<Patrimonio> patrimonios;


    public long getId_marca() {
        return id_marca;
    }

    public void setId_marca(long id_marca) {
        this.id_marca = id_marca;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Patrimonio> getPatrimonios() {
        return patrimonios;
    }

    public void setPatrimonios(List<Patrimonio> patrimonios) {
        this.patrimonios = patrimonios;
    }
    
    
}

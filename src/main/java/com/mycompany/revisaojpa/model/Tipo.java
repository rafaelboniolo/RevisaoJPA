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

@Entity(name = "tb_tipo")
public class Tipo {
    @Id
    @GeneratedValue
    private long id_predio;
    private String descricao;
    
    @OneToMany(mappedBy = "tipo")
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

    public List<Patrimonio> getPatrimonios() {
        return patrimonios;
    }

    public void setPatrimonios(List<Patrimonio> patrimonios) {
        this.patrimonios = patrimonios;
    }
    
    
}

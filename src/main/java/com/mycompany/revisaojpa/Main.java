/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.revisaojpa;

import com.mycompany.revisaojpa.connection.HibernateConnection;
import com.mycompany.revisaojpa.model.Patrimonio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author a1808338
 */
public class Main {
    public static void main(String[] args) {
        HibernateConnection.getEntityManager();
        
       
//       List<Cidade> cidades =(List) Persistence.findAll(Cidade.class);
       
//       cidades.forEach((cidade)->{;
//           System.out.println(cidade.getDescricao()+"->");
//           cidade.getPredios().forEach(predio -> {
//               System.out.println(predio.getDescricao()+": "+predio.getPatrimonios().size());
//           });
//    });
//       
//     

//        List<Bairro> bairros =(List) Persistence.findAll(Bairro.class);
//        
//        bairros.forEach(bairro -> {
//            bairro.getPredios().forEach(predio->{
//                System.out.println(predio.getPatrimonios().stream().count());
//            });
//        });
//        
//        Bairro bairro = (Bairro) Persistence.findOne(Bairro.class,(long)1);  ;
//        
//        bairro.getPredios().forEach(predio->{
//            predio.getPatrimonios().forEach(patrimonio->{
//                System.out.println(patrimonio.getVlraquisicao());
//            });
//        });

        
          EntityManager manager = HibernateConnection.getEntityManager();
          CriteriaBuilder cb = manager.getCriteriaBuilder();
          CriteriaQuery c = cb.createQuery(Patrimonio.class);
          Root<Patrimonio> a = c.from(Patrimonio.class);
          
          c.select(a);
          
          Predicate pred = cb.equal(a.get("id_predio"), 1);
          
          c.where(pred);
          
          TypedQuery<Patrimonio> query = manager.createQuery(c);
          List<Patrimonio> cidades = query.getResultList();
          
          cidades.forEach((t) -> {
              System.out.println(t.getDescricao());
          });

    }
}

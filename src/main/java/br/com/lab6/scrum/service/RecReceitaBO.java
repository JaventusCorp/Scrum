/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.service;

import br.com.lab6.scrum.dao.RecReceitaDAO;
import br.com.lab6.scrum.model.RecReceita;
import java.util.List;

/**
 *
 * @author thiago
 */
public class RecReceitaBO {
    private RecReceitaDAO recReceitaDAO;
    
    public void salvar(RecReceita recReceita){
        recReceitaDAO.save(recReceita);      
    }
    
    public void deletar(RecReceita recReceita){
        recReceitaDAO.remove(recReceita);
    }
    
    public void atualizar(RecReceita recReceita){
        recReceitaDAO.update(recReceita);
    }
    
    public List<RecReceita> listar(){
        return recReceitaDAO.list();
    }
    
    public RecReceita buscar(Object id){
        return recReceitaDAO.find(id);
    }
    
}

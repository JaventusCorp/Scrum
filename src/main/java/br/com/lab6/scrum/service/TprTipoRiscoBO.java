/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.service;

import br.com.lab6.scrum.dao.TprTipoRiscoDAO;
import br.com.lab6.scrum.model.TprTipoRisco;
import java.util.List;

/**
 *
 * @author thiago
 */
public class TprTipoRiscoBO {
    
    private TprTipoRiscoDAO tprTipoRiscoDAO;
    
    public void salvar(TprTipoRisco tprTipoRisco){
        tprTipoRiscoDAO.save(tprTipoRisco);      
    }
    
    public void deletar(TprTipoRisco tprTipoRisco){
        tprTipoRiscoDAO.remove(tprTipoRisco);
    }
    
    public void atualizar(TprTipoRisco tprTipoRisco){
        tprTipoRiscoDAO.update(tprTipoRisco);
    }
    
    public List<TprTipoRisco> listar(){
        return tprTipoRiscoDAO.list();
    }
    
    public TprTipoRisco buscar(Object id){
        return tprTipoRiscoDAO.find(id);
    }    
}

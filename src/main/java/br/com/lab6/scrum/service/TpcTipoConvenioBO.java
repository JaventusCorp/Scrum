/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.service;

import br.com.lab6.scrum.dao.TpcTipoConvenioDAO;
import br.com.lab6.scrum.model.TpcTipoConvenio;
import java.util.List;

/**
 *
 * @author thiago
 */
public class TpcTipoConvenioBO {
    
    private TpcTipoConvenioDAO tpcTipoConvenioDAO;
    
    public void salvar(TpcTipoConvenio tpcTipoConvenio){
        tpcTipoConvenioDAO.save(tpcTipoConvenio);      
    }
    
    public void deletar(TpcTipoConvenio tpcTipoConvenio){
        tpcTipoConvenioDAO.remove(tpcTipoConvenio);
    }
    
    public void atualizar(TpcTipoConvenio tpcTipoConvenio){
        tpcTipoConvenioDAO.update(tpcTipoConvenio);
    }
    
    public List<TpcTipoConvenio> listar(){
        return tpcTipoConvenioDAO.list();
    }
    
    public TpcTipoConvenio buscar(Object id){
        return tpcTipoConvenioDAO.find(id);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.service;

import br.com.lab6.scrum.dao.ClaClassificacaoDAO;
import br.com.lab6.scrum.model.ClaClassificacao;
import java.util.List;

/**
 *
 * @author thiago
 */
public class ClaClassificacaoBO {

    private ClaClassificacaoDAO claClassificacaoDAO;
    
    public void salvar(ClaClassificacao claClassificacao){
        claClassificacaoDAO.save(claClassificacao);      
    }
    
    public void deletar(ClaClassificacao claClassificacao){
        claClassificacaoDAO.remove(claClassificacao);
    }
    
    public void atualizar(ClaClassificacao claClassificacao){
        claClassificacaoDAO.update(claClassificacao);
    }
    
    public List<ClaClassificacao> listar(){
        return claClassificacaoDAO.list();
    }
    
    public ClaClassificacao buscar(Object id){
        return claClassificacaoDAO.find(id);
    }
    
}

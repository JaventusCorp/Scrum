/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.service;

import java.util.List;
import br.com.lab6.scrum.dao.PrePrescricaoDAO;
import br.com.lab6.scrum.model.PrePrescricao;
import java.util.List;

/**
 *
 * @author Marcus
 */
public class PrePrescricaoBO {
    private PrePrescricaoDAO prePrescricaoDAO;
    
    public void salvar(PrePrescricao prePrescricao){
        prePrescricaoDAO.save(prePrescricao);      
    }
    
    public void deletar(PrePrescricao prePrescricao){
        prePrescricaoDAO.remove(prePrescricao);
    }
    
    public void atualizar(PrePrescricao prePrescricao){
        prePrescricaoDAO.update(prePrescricao);
    }
    
    public List<PrePrescricao> listar(){
        return prePrescricaoDAO.list();
    }
    
    public PrePrescricao buscar(Object id){
        return prePrescricaoDAO.find(id);
    }
    
}

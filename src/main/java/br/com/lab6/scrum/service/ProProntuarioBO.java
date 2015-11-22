/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.service;

import br.com.lab6.scrum.dao.ProProntuarioDAO;
import br.com.lab6.scrum.model.ProProntuario;
import java.util.List;

/**
 *
 * @author thiago
 */
public class ProProntuarioBO {
    private ProProntuarioDAO proProntuarioDAO;
    
    public void salvar(ProProntuario proProntuario){
        proProntuarioDAO.save(proProntuario);      
    }
    
    public void deletar(ProProntuario proProntuario){
        proProntuarioDAO.remove(proProntuario);
    }
    
    public void atualizar(ProProntuario proProntuario){
        proProntuarioDAO.update(proProntuario);
    }
    
    public List<ProProntuario> listar(){
        return proProntuarioDAO.list();
    }
    
    public ProProntuario buscar(Object id){
        return proProntuarioDAO.find(id);
    }
    
}

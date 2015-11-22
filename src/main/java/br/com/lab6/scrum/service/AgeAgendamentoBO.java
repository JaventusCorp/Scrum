/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.service;

import br.com.lab6.scrum.dao.AgeAgendamentoDAO;
import br.com.lab6.scrum.model.AgeAgendamento;
import java.util.List;


/**
 *
 * @author Marcus
 */
public class AgeAgendamentoBO {
    
    private AgeAgendamentoDAO ageAgendamentoDAO;
    
    public void salvar(AgeAgendamento ageAgendamento){
        ageAgendamentoDAO.save(ageAgendamento);
    }
    
    public void deletar(AgeAgendamento ageAgendamento){
        ageAgendamentoDAO.remove(ageAgendamento);
    }
    
    public void atualizar(AgeAgendamento ageAgendamento){
        ageAgendamentoDAO.update(ageAgendamento);
    }
    
    public List<AgeAgendamento> listar(){
        return ageAgendamentoDAO.list();
    }
    
    public AgeAgendamento buscar(Object id){
        return ageAgendamentoDAO.find(id);
    }
    
}

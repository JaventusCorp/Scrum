/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.service;

import br.com.lab6.scrum.dao.MedMedicoDAO;
import br.com.lab6.scrum.model.MedMedico;
import java.util.List;

/**
 *
 * @author thiago
 */
public class MedMedicoBO {

    private MedMedicoDAO medMedicoDAO;
    
    public void salvar(MedMedico medMedico){
        medMedicoDAO.save(medMedico);      
    }
    
    public void deletar(MedMedico medMedico){
        medMedicoDAO.remove(medMedico);
    }
    
    public void atualizar(MedMedico medMedico){
        medMedicoDAO.update(medMedico);
    }
    
    public List<MedMedico> listar(){
        return medMedicoDAO.list();
    }
    
    public MedMedico buscar(Object id){
        return medMedicoDAO.find(id);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.service;

import br.com.lab6.scrum.dao.PacPacienteDAO;
import br.com.lab6.scrum.model.PacPaciente;
import java.util.List;

/**
 *
 * @author thiago
 */
public class PacPacienteBO {

    private PacPacienteDAO pacPacienteDAO;
    
    public void salvar(PacPaciente pacPaciente){
        pacPacienteDAO.save(pacPaciente);      
    }
    
    public void deletar(PacPaciente pacPaciente){
        pacPacienteDAO.remove(pacPaciente);
    }
    
    public void atualizar(PacPaciente pacPaciente){
        pacPacienteDAO.update(pacPaciente);
    }
    
    public List<PacPaciente> listar(){
        return pacPacienteDAO.list();
    }
    
    public PacPaciente buscar(Object id){
        return pacPacienteDAO.find(id);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.service;

import br.com.lab6.scrum.dao.ConConsultaDAO;
import br.com.lab6.scrum.model.ConConsulta;
import java.util.List;

/**
 *
 * @author thiago
 */
public class ConsultaBO {
    
    private ConConsultaDAO conConsultaDAO;
    
    public void salvar(ConConsulta conConsulta){
        conConsultaDAO.save(conConsulta);      
    }
    
    public void deletar(ConConsulta conConsulta){
        conConsultaDAO.remove(conConsulta);
    }
    
    public void atualizar(ConConsulta conConsulta){
        conConsultaDAO.update(conConsulta);
    }
    
    public List<ConConsulta> listar(){
        return conConsultaDAO.list();
    }
    
    public ConConsulta buscar(Object id){
        return conConsultaDAO.find(id);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.service;

import br.com.lab6.scrum.dao.EspEspecialidadeDAO;
import br.com.lab6.scrum.model.EspEspecialidade;
import java.util.List;

/**
 *
 * @author thiago
 */
public class EspEspecialidadeBO {

    private EspEspecialidadeDAO espEspecialidadeDAO;
    
    public void salvar(EspEspecialidade espEspecialidade){
        espEspecialidadeDAO.save(espEspecialidade);      
    }
    
    public void deletar(EspEspecialidade espEspecialidade){
        espEspecialidadeDAO.remove(espEspecialidade);
    }
    
    public void atualizar(EspEspecialidade espEspecialidade){
        espEspecialidadeDAO.update(espEspecialidade);
    }
    
    public List<EspEspecialidade> listar(){
        return espEspecialidadeDAO.list();
    }
    
    public EspEspecialidade buscar(Object id){
        return espEspecialidadeDAO.find(id);
    }
    
    
}

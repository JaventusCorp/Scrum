/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.service;

import br.com.lab6.scrum.dao.UsrUsuarioDAO;
import br.com.lab6.scrum.model.UsrUsuario;
import java.util.List;

/**
 *
 * @author thiago
 */
public class UsrUsuarioBO {
    private UsrUsuarioDAO usrUsuarioDAO;
    
    public void salvar(UsrUsuario usrUsuario){
        usrUsuarioDAO.save(usrUsuario);      
    }
    
    public void deletar(UsrUsuario usrUsuario){
        usrUsuarioDAO.remove(usrUsuario);
    }
    
    public void atualizar(UsrUsuario usrUsuario){
        usrUsuarioDAO.update(usrUsuario);
    }
    
    public List<UsrUsuario> listar(){
        return usrUsuarioDAO.list();
    }
    
    public UsrUsuario buscar(Object id){
        return usrUsuarioDAO.find(id);
    }    
}

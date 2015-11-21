package br.com.lab6.scrum.dao;

import br.com.lab6.scrum.model.UsrUsuario;

/**
 *
 * @author Hideki
 */
public class UsrUsuarioDAO extends GenericDAO<UsrUsuario>{

	private static final long serialVersionUID = 241273492796102127L;
	
	public UsrUsuarioDAO() {
		super(UsrUsuario.class);
	}
}

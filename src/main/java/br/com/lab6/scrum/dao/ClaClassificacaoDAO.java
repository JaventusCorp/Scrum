package br.com.lab6.scrum.dao;

import br.com.lab6.scrum.model.ClaClassificacao;

/**
 *
 * @author Hideki
 */
public class ClaClassificacaoDAO extends GenericDAO<ClaClassificacao>{

	private static final long serialVersionUID = -6864582482801422525L;
	
	public ClaClassificacaoDAO() {
		super(ClaClassificacao.class);
	}
}

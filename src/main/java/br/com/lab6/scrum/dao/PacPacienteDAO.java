package br.com.lab6.scrum.dao;

import br.com.lab6.scrum.model.PacPaciente;

/**
 *
 * @author Hideki
 */
public class PacPacienteDAO extends GenericDAO<PacPaciente>{

	private static final long serialVersionUID = 860729206259156640L;

	public PacPacienteDAO() {
		super(PacPaciente.class);
	}
}

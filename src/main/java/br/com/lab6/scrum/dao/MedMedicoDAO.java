package br.com.lab6.scrum.dao;

import br.com.lab6.scrum.model.MedMedico;

/**
 *
 * @author Hideki
 */
public class MedMedicoDAO extends GenericDAO<MedMedico>{

	private static final long serialVersionUID = 3924652555690692426L;

	public MedMedicoDAO() {
		super(MedMedico.class);
	}
}

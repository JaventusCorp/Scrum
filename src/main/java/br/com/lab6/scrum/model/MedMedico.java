/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "med_medico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedMedico.findAll", query = "SELECT m FROM MedMedico m"),
    @NamedQuery(name = "MedMedico.findByMedId", query = "SELECT m FROM MedMedico m WHERE m.medId = :medId")})
public class MedMedico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "med_id")
    private Integer medId;
    @JoinColumn(name = "usr_id", referencedColumnName = "usr_id")
    @ManyToOne
    private UsrUsuario usrId;
    @JoinColumn(name = "esp_id", referencedColumnName = "esp_id")
    @ManyToOne
    private EspEspecialidade espId;

    public MedMedico() {
    }

    public MedMedico(Integer medId) {
        this.medId = medId;
    }

    public Integer getMedId() {
        return medId;
    }

    public void setMedId(Integer medId) {
        this.medId = medId;
    }

    public UsrUsuario getUsrId() {
        return usrId;
    }

    public void setUsrId(UsrUsuario usrId) {
        this.usrId = usrId;
    }

    public EspEspecialidade getEspId() {
        return espId;
    }

    public void setEspId(EspEspecialidade espId) {
        this.espId = espId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (medId != null ? medId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedMedico)) {
            return false;
        }
        MedMedico other = (MedMedico) object;
        if ((this.medId == null && other.medId != null) || (this.medId != null && !this.medId.equals(other.medId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lab6.scrum.model.MedMedico[ medId=" + medId + " ]";
    }
    
}

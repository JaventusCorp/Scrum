/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab6.scrum.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Lucas
 */
@Entity
public class AgeAgendamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "age_id")
    private Integer ageId;
    @Basic(optional = false)
    @Column(name = "age_data")
    @Temporal(TemporalType.DATE)
    private Date ageData;
    @Basic(optional = false)
    @Column(name = "age_hora")
    private String ageHora;
    @JoinColumn(name = "pac_id", referencedColumnName = "pac_id")
    @ManyToOne(optional = false)
    private PacPaciente pacId;
    @JoinColumn(name = "med_id", referencedColumnName = "med_id")
    @ManyToOne(optional = false)
    private MedMedico medId;

    public AgeAgendamento() {
    }

    public AgeAgendamento(Integer ageId) {
        this.ageId = ageId;
    }

    public AgeAgendamento(Integer ageId, Date ageData, String ageHora) {
        this.ageId = ageId;
        this.ageData = ageData;
        this.ageHora = ageHora;
    }

    public Integer getAgeId() {
        return ageId;
    }

    public void setAgeId(Integer ageId) {
        this.ageId = ageId;
    }

    public Date getAgeData() {
        return ageData;
    }

    public void setAgeData(Date ageData) {
        this.ageData = ageData;
    }

    public String getAgeHora() {
        return ageHora;
    }

    public void setAgeHora(String ageHora) {
        this.ageHora = ageHora;
    }

    public PacPaciente getPacId() {
        return pacId;
    }

    public void setPacId(PacPaciente pacId) {
        this.pacId = pacId;
    }

    public MedMedico getMedId() {
        return medId;
    }

    public void setMedId(MedMedico medId) {
        this.medId = medId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ageId != null ? ageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgeAgendamento)) {
            return false;
        }
        AgeAgendamento other = (AgeAgendamento) object;
        if ((this.ageId == null && other.ageId != null) || (this.ageId != null && !this.ageId.equals(other.ageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lab6.scrum.model.AgeAgendamento[ ageId=" + ageId + " ]";
    }
    
}

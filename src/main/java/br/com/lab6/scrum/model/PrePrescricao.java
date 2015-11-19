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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "pre_prescricao")
public class PrePrescricao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pre_id")
    private Integer preId;
    @JoinColumn(name = "rec_id", referencedColumnName = "rec_id")
    @ManyToOne(optional = false)
    private RecReceita recId;
    @JoinColumn(name = "pac_id", referencedColumnName = "pac_id")
    @ManyToOne(optional = false)
    private PacPaciente pacId;
    @JoinColumn(name = "med_id", referencedColumnName = "med_id")
    @ManyToOne(optional = false)
    private MedMedico medId;

    public PrePrescricao() {
    }

    public PrePrescricao(Integer preId) {
        this.preId = preId;
    }

    public Integer getPreId() {
        return preId;
    }

    public void setPreId(Integer preId) {
        this.preId = preId;
    }

    public RecReceita getRecId() {
        return recId;
    }

    public void setRecId(RecReceita recId) {
        this.recId = recId;
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
        hash += (preId != null ? preId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrePrescricao)) {
            return false;
        }
        PrePrescricao other = (PrePrescricao) object;
        if ((this.preId == null && other.preId != null) || (this.preId != null && !this.preId.equals(other.preId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lab6.scrum.model.PrePrescricao[ preId=" + preId + " ]";
    }
    
}

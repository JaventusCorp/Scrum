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
@Table(name = "pro_prontuario")
public class ProProntuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pro_id")
    private Integer proId;
    @JoinColumn(name = "pac_id", referencedColumnName = "pac_id")
    @ManyToOne(optional = false)
    private PacPaciente pacId;
    @JoinColumn(name = "med_id", referencedColumnName = "med_id")
    @ManyToOne(optional = false)
    private MedMedico medId;
    @JoinColumn(name = "con_id", referencedColumnName = "con_id")
    @ManyToOne(optional = false)
    private ConConsulta conId;

    public ProProntuario() {
    }

    public ProProntuario(Integer proId) {
        this.proId = proId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
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

    public ConConsulta getConId() {
        return conId;
    }

    public void setConId(ConConsulta conId) {
        this.conId = conId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proId != null ? proId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProProntuario)) {
            return false;
        }
        ProProntuario other = (ProProntuario) object;
        if ((this.proId == null && other.proId != null) || (this.proId != null && !this.proId.equals(other.proId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lab6.scrum.model.ProProntuario[ proId=" + proId + " ]";
    }
    
}

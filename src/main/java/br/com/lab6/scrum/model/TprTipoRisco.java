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
import javax.persistence.Table;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "tpr_tipo_risco")
public class TprTipoRisco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tpr_id")
    private Integer tprId;
    @Basic(optional = false)
    @Column(name = "tpr_nome")
    private String tprNome;

    public TprTipoRisco() {
    }

    public TprTipoRisco(Integer tprId) {
        this.tprId = tprId;
    }

    public TprTipoRisco(Integer tprId, String tprNome) {
        this.tprId = tprId;
        this.tprNome = tprNome;
    }

    public Integer getTprId() {
        return tprId;
    }

    public void setTprId(Integer tprId) {
        this.tprId = tprId;
    }

    public String getTprNome() {
        return tprNome;
    }

    public void setTprNome(String tprNome) {
        this.tprNome = tprNome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tprId != null ? tprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TprTipoRisco)) {
            return false;
        }
        TprTipoRisco other = (TprTipoRisco) object;
        if ((this.tprId == null && other.tprId != null) || (this.tprId != null && !this.tprId.equals(other.tprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lab6.scrum.model.TprTipoRisco[ tprId=" + tprId + " ]";
    }
    
}

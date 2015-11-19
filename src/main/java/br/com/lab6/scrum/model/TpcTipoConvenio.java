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
import javax.persistence.Table;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "tpc_tipo_convenio")
public class TpcTipoConvenio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "tpc_id")
    private Integer tpcId;
    @Basic(optional = false)
    @Column(name = "tpc_convenio")
    private String tpcConvenio;

    public TpcTipoConvenio() {
    }

    public TpcTipoConvenio(Integer tpcId) {
        this.tpcId = tpcId;
    }

    public TpcTipoConvenio(Integer tpcId, String tpcConvenio) {
        this.tpcId = tpcId;
        this.tpcConvenio = tpcConvenio;
    }

    public Integer getTpcId() {
        return tpcId;
    }

    public void setTpcId(Integer tpcId) {
        this.tpcId = tpcId;
    }

    public String getTpcConvenio() {
        return tpcConvenio;
    }

    public void setTpcConvenio(String tpcConvenio) {
        this.tpcConvenio = tpcConvenio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpcId != null ? tpcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpcTipoConvenio)) {
            return false;
        }
        TpcTipoConvenio other = (TpcTipoConvenio) object;
        if ((this.tpcId == null && other.tpcId != null) || (this.tpcId != null && !this.tpcId.equals(other.tpcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lab6.scrum.model.TpcTipoConvenio[ tpcId=" + tpcId + " ]";
    }
    
}

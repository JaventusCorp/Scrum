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
@Table(name = "esp_especialidade")
public class EspEspecialidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "esp_id")
    private Integer espId;
    @Basic(optional = false)
    @Column(name = "esp_especialidade")
    private String espEspecialidade;

    public EspEspecialidade() {
    }

    public EspEspecialidade(Integer espId) {
        this.espId = espId;
    }

    public EspEspecialidade(Integer espId, String espEspecialidade) {
        this.espId = espId;
        this.espEspecialidade = espEspecialidade;
    }

    public Integer getEspId() {
        return espId;
    }

    public void setEspId(Integer espId) {
        this.espId = espId;
    }

    public String getEspEspecialidade() {
        return espEspecialidade;
    }

    public void setEspEspecialidade(String espEspecialidade) {
        this.espEspecialidade = espEspecialidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (espId != null ? espId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EspEspecialidade)) {
            return false;
        }
        EspEspecialidade other = (EspEspecialidade) object;
        if ((this.espId == null && other.espId != null) || (this.espId != null && !this.espId.equals(other.espId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lab6.scrum.model.EspEspecialidade[ espId=" + espId + " ]";
    }
    
}

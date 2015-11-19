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
import javax.persistence.Lob;
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
@Table(name = "cla_classificacao")
public class ClaClassificacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cla_id")
    private Integer claId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cla_altura")
    private Double claAltura;
    @Column(name = "cla_pressao")
    private Double claPressao;
    @Column(name = "cla_temperatura")
    private Double claTemperatura;
    @Column(name = "cla_peso")
    private Double claPeso;
    @Column(name = "cla_glicose")
    private String claGlicose;
    @Lob
    @Column(name = "observacao")
    private String observacao;
    @JoinColumn(name = "tpr_id", referencedColumnName = "tpr_id")
    @ManyToOne
    private TprTipoRisco tprId;
    @JoinColumn(name = "pac_id", referencedColumnName = "pac_id")
    @ManyToOne(optional = false)
    private PacPaciente pacId;
    @JoinColumn(name = "med_id", referencedColumnName = "med_id")
    @ManyToOne(optional = false)
    private MedMedico medId;

    public ClaClassificacao() {
    }

    public ClaClassificacao(Integer claId) {
        this.claId = claId;
    }

    public Integer getClaId() {
        return claId;
    }

    public void setClaId(Integer claId) {
        this.claId = claId;
    }

    public Double getClaAltura() {
        return claAltura;
    }

    public void setClaAltura(Double claAltura) {
        this.claAltura = claAltura;
    }

    public Double getClaPressao() {
        return claPressao;
    }

    public void setClaPressao(Double claPressao) {
        this.claPressao = claPressao;
    }

    public Double getClaTemperatura() {
        return claTemperatura;
    }

    public void setClaTemperatura(Double claTemperatura) {
        this.claTemperatura = claTemperatura;
    }

    public Double getClaPeso() {
        return claPeso;
    }

    public void setClaPeso(Double claPeso) {
        this.claPeso = claPeso;
    }

    public String getClaGlicose() {
        return claGlicose;
    }

    public void setClaGlicose(String claGlicose) {
        this.claGlicose = claGlicose;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public TprTipoRisco getTprId() {
        return tprId;
    }

    public void setTprId(TprTipoRisco tprId) {
        this.tprId = tprId;
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
        hash += (claId != null ? claId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClaClassificacao)) {
            return false;
        }
        ClaClassificacao other = (ClaClassificacao) object;
        if ((this.claId == null && other.claId != null) || (this.claId != null && !this.claId.equals(other.claId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lab6.scrum.model.ClaClassificacao[ claId=" + claId + " ]";
    }
    
}

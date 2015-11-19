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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "pac_paciente")
public class PacPaciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pac_id")
    private Integer pacId;
    @Basic(optional = false)
    @Column(name = "pac_nome")
    private String pacNome;
    @Basic(optional = false)
    @Column(name = "pac_rg")
    private String pacRg;
    @Basic(optional = false)
    @Column(name = "pac_data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date pacDataNascimento;
    @Column(name = "pac_numero_cartao")
    private String pacNumeroCartao;
    @Lob
    @Column(name = "pac_endereco")
    private String pacEndereco;
    @JoinColumn(name = "tpc_id", referencedColumnName = "tpc_id")
    @ManyToOne(optional = false)
    private TpcTipoConvenio tpcId;

    public PacPaciente() {
    }

    public PacPaciente(Integer pacId) {
        this.pacId = pacId;
    }

    public PacPaciente(Integer pacId, String pacNome, String pacRg, Date pacDataNascimento) {
        this.pacId = pacId;
        this.pacNome = pacNome;
        this.pacRg = pacRg;
        this.pacDataNascimento = pacDataNascimento;
    }

    public Integer getPacId() {
        return pacId;
    }

    public void setPacId(Integer pacId) {
        this.pacId = pacId;
    }

    public String getPacNome() {
        return pacNome;
    }

    public void setPacNome(String pacNome) {
        this.pacNome = pacNome;
    }

    public String getPacRg() {
        return pacRg;
    }

    public void setPacRg(String pacRg) {
        this.pacRg = pacRg;
    }

    public Date getPacDataNascimento() {
        return pacDataNascimento;
    }

    public void setPacDataNascimento(Date pacDataNascimento) {
        this.pacDataNascimento = pacDataNascimento;
    }

    public String getPacNumeroCartao() {
        return pacNumeroCartao;
    }

    public void setPacNumeroCartao(String pacNumeroCartao) {
        this.pacNumeroCartao = pacNumeroCartao;
    }

    public String getPacEndereco() {
        return pacEndereco;
    }

    public void setPacEndereco(String pacEndereco) {
        this.pacEndereco = pacEndereco;
    }

    public TpcTipoConvenio getTpcId() {
        return tpcId;
    }

    public void setTpcId(TpcTipoConvenio tpcId) {
        this.tpcId = tpcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pacId != null ? pacId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacPaciente)) {
            return false;
        }
        PacPaciente other = (PacPaciente) object;
        if ((this.pacId == null && other.pacId != null) || (this.pacId != null && !this.pacId.equals(other.pacId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lab6.scrum.model.PacPaciente[ pacId=" + pacId + " ]";
    }
    
}

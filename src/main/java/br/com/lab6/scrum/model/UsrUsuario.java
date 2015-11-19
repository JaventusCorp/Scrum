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
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "usr_usuario")
public class UsrUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "usr_id")
    private Integer usrId;
    @Column(name = "usr_nome")
    private String usrNome;
    @Column(name = "usr_rg")
    private String usrRg;
    @Column(name = "usr_data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date usrDataNascimento;

    public UsrUsuario() {
    }

    public UsrUsuario(Integer usrId) {
        this.usrId = usrId;
    }

    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public String getUsrNome() {
        return usrNome;
    }

    public void setUsrNome(String usrNome) {
        this.usrNome = usrNome;
    }

    public String getUsrRg() {
        return usrRg;
    }

    public void setUsrRg(String usrRg) {
        this.usrRg = usrRg;
    }

    public Date getUsrDataNascimento() {
        return usrDataNascimento;
    }

    public void setUsrDataNascimento(Date usrDataNascimento) {
        this.usrDataNascimento = usrDataNascimento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrUsuario)) {
            return false;
        }
        UsrUsuario other = (UsrUsuario) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lab6.scrum.model.UsrUsuario[ usrId=" + usrId + " ]";
    }
    
}

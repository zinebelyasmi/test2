/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author lenovo
 */
@Entity
public class Evenement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String titre;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateEvenement;

    public Evenement() {
    }

    public Evenement(String id) {
        this.id = id;
    }

    public Evenement(String id, String titre, Date dateEvenement) {
        this.id = id;
        this.titre = titre;
        this.dateEvenement = dateEvenement;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDateEvenement() {
        return dateEvenement;
    }

    public void setDateEvenement(Date dateEvenement) {
        this.dateEvenement = dateEvenement;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evenement)) {
            return false;
        }
        Evenement other = (Evenement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Evenement{" + "id=" + id + ", titre=" + titre + ", dateEvenement=" + dateEvenement + '}';
    }

}

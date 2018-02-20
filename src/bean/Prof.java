/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author lenovo
 */
@Entity
public class Prof implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;

    private String email;
    private String nom;
    private String password;
    private String prenom;
    @OneToOne(mappedBy = "prof")
    private Exam exam;
    @OneToMany(mappedBy = "prof")
    private List<Eleve> eleves;
 

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public List<Eleve> getEleves() {
        return eleves;
    }

    public void setEleves(List<Eleve> eleves) {
        this.eleves = eleves;
    }



    public Prof() {
    }

    public Prof(String id) {
        this.id = id;
    }

    public Prof(String id, String email, String nom, String password, String prenom) {
        this.id = id;
        this.email = email;
        this.nom = nom;
        this.password = password;
        this.prenom = prenom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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
        if (!(object instanceof Prof)) {
            return false;
        }
        Prof other = (Prof) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Prof{" + "id=" + id + ", email=" + email + ", nom=" + nom + ", password=" + password + ", prenom=" + prenom + '}';
    }

    
}

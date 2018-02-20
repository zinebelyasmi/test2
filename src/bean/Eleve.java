/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author lenovo
 */
@Entity
public class Eleve implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String nom;
    private String prenom;
    private int age;
    private String genre;
    
    
      @ManyToOne
    private Classe classe;
    @ManyToOne
    private Parent parents;
    @ManyToOne
    private Prof prof;
    
    

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Eleve(String id, String nom, String prenom, int age, String genre) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.genre = genre;
    }
    
    

    
    
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Parent getParents() {
        return parents;
    }

    public void setParents(Parent parents) {
        this.parents = parents;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Eleve() {
    }

    public Eleve(String id) {
        this.id = id;
    }

    public Eleve(String id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        if (!(object instanceof Eleve)) {
            return false;
        }
        Eleve other = (Eleve) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Eleve{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", genre=" + genre + '}';
    }

    
}

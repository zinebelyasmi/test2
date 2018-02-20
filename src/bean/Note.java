/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author lenovo
 */
@Entity
public class Note implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String observation;
    private String lanote;

    @OneToOne
    private Exam exam;

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getLanote() {
        return lanote;
    }

    public void setLanote(String lanote) {
        this.lanote = lanote;
    }

    public Note() {
    }

    public Note(String id) {
        this.id = id;
    }

    public Note(String id, String observation, String lanote) {
        this.id = id;
        this.observation = observation;
        this.lanote = lanote;
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
        if (!(object instanceof Note)) {
            return false;
        }
        Note other = (Note) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Note{" + "id=" + id + ", observation=" + observation + ", lanote=" + lanote + '}';
    }
    
}

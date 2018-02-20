/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.ViewLuncher;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class AdmineChoiceController implements Initializable {

    @FXML
    private Button eleve;
    @FXML
    private Button prof;
    @FXML
    private Button evenement;

    public Button getEleve() {
        return eleve;
    }

    public void setEleve(Button eleve) {
        this.eleve = eleve;
    }

    public Button getProf() {
        return prof;
    }

    public void setProf(Button prof) {
        this.prof = prof;
    }

    public Button getEvenement() {
        return evenement;
    }

    public void setEvenement(Button evenement) {
        this.evenement = evenement;
    }
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

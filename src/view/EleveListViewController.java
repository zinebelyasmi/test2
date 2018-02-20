/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Eleve;
import helper.EleveFxHelper;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import service.EleveService;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class EleveListViewController implements Initializable {

    @FXML
    private TextField id;
    @FXML
    private TextField nom;
    @FXML
    private TextField prenom;
    @FXML
    private TextField age;
    @FXML
    private RadioButton fille;
    @FXML
    private RadioButton garçon;
    @FXML
    private ToggleGroup toggleGroup;
    @FXML
    private Button créer;
    
    
    private Eleve getParam(){
        Eleve eleve = new Eleve();
        eleve.setId(id.getText());
        eleve.setNom(nom.getText());
        eleve.setPrenom(prenom.getText());
        eleve.setAge(new Integer("" + age.getText()));
        toggleGroup = new ToggleGroup();
        this.fille.setToggleGroup(toggleGroup);
        this.garçon.setToggleGroup(toggleGroup);
        return eleve;
        
    }

    @FXML
    EleveService eleveService = new EleveService();

    @FXML
    TableView eleveTableView = new TableView();
    private EleveFxHelper eleveFxHelper;

    private void initHelper() {
        eleveFxHelper = new EleveFxHelper(eleveTableView, eleveService.findAll());

    }
    
    @FXML
    private void créer(ActionEvent event){
        Eleve eleve = getParam();
        eleveService.create(eleve);
        eleveFxHelper.create(eleve);
        
    } 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initHelper();
           
    }

    public TextField getId() {
        return id;
    }

    public void setId(TextField id) {
        this.id = id;
    }

    public TextField getNom() {
        return nom;
    }

    public void setNom(TextField nom) {
        this.nom = nom;
    }

    public TextField getPrenom() {
        return prenom;
    }

    public void setPrenom(TextField prenom) {
        this.prenom = prenom;
    }

    public TextField getAge() {
        return age;
    }

    public void setAge(TextField age) {
        this.age = age;
    }

    public RadioButton getFille() {
        return fille;
    }

    public void setFille(RadioButton fille) {
        this.fille = fille;
    }

    public RadioButton getGarçon() {
        return garçon;
    }

    public void setGarçon(RadioButton garçon) {
        this.garçon = garçon;
    }

   

    public TableView getEleveTableView() {
        return eleveTableView;
    }

    public void setEleveTableView(TableView eleveTableView) {
        this.eleveTableView = eleveTableView;
    }

    public Button getCréer() {
        return créer;
    }

    public void setCréer(Button créer) {
        this.créer = créer;
    }

}

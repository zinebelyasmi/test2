/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Admine;
import java.awt.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import service.AdmineService;
import util.Session;
/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class AdmineConnectionController implements Initializable {
    
       AdmineService admineService = new AdmineService();

    @FXML
    private TextField id;
    @FXML
    private PasswordField password;

    @FXML
    private Button Seconnecter;
    @FXML
    private Button Reset;
    @FXML
    private Button Exit;
    
     public TextField getId() {
        return id;
    }

    public void setId(TextField id) {
        this.id = id;
    }

    public PasswordField getPassword() {
        return password;
    }

    public void setPassword(PasswordField password) {
        this.password = password;
    }

    public Button getSeconnecter() {
        return Seconnecter;
    }

    public void setSeconnecter(Button Seconnecter) {
        this.Seconnecter = Seconnecter;
    }

    public Button getReset() {
        return Reset;
    }

    public void setReset(Button Reset) {
        this.Reset = Reset;
    }

    public Button getExit() {
        return Exit;
    }

    public void setExit(Button Exit) {
        this.Exit = Exit;
    }




    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Seconnecter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
    public void handle(ActionEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("view/AdmineChoice.fxml"));
            Stage stage = new Stage();
            stage.setTitle("admine");
            stage.setScene(new Scene(root));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
});
        Seconnecter.setOnAction((event) -> {  //sifnInBtn=id
        Admine admine= new Admine();
        admine.setId(id.getText());
        admine.setPassword(password.getText());
       int res = admineService.isConnecter(admine);
       if(res>0){
           Session.updateAttribute(admine,"utilisateurConnecté");
           JOptionPane.showMessageDialog(null, "Connexion avec succes bienvenue : "+admine.getId(), "Info",JOptionPane.INFORMATION_MESSAGE);
           
       }else{
           JOptionPane.showMessageDialog(null, "Connexion echec ","Error",JOptionPane.ERROR_MESSAGE);
       }
        });
        
        
    }
}
  
   



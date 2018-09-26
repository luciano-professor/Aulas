/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alerts;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author Luciano
 */
public class AlertsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void alerta1(ActionEvent event) {
        
        //Caixa de diálogo de informação
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Caixa de Informação"); //Titulo da caixa
        alerta.setHeaderText("Cabeçalho da Caixa"); //Cabeçalho
        alerta.setContentText("Mensagem de informação"); //Mensagem
        
        alerta.showAndWait(); //comando para mostrar o diálogo
        
        //---------
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author Luciano
 */
public class WebController implements Initializable {

    @FXML
    private WebView web;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void carregar(ActionEvent event) {
        
        //Pra carregar uma pagina no componente WebView, é necessario pegar
        //o mecanismo (engine)
        WebEngine mecanismo = web.getEngine();
        
        //Mando o mecanismo carregar a pagina
        mecanismo.load("http://www.google.com");
        
        
    }
    
}

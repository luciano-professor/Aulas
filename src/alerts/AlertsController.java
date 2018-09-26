/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alerts;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;

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
        
        //Tipos de configuração de Icone
        //Alert.AlertType.INFORMATION - Informação
        //Alert.AlertType.ERROR - Erro
        //Alert.AlertType.WARNING - Alerta
        
        //Caixa de diálogo de informação
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        
        alerta.setTitle("Caixa de Informação"); //Titulo da caixa
        alerta.setHeaderText("Cabeçalho da Caixa"); //Cabeçalho
        
        //Se nao quiser o cabeçalho coloca
        //alerta.setHeaderText(null);
        
        alerta.setContentText("Mensagem de informação"); //Mensagem
        
        alerta.showAndWait(); //comando para mostrar o diálogo
        
        //---------
        
        //Caixa de Confirmação
        Alert alerta2 = new Alert(Alert.AlertType.CONFIRMATION);
        alerta2.setTitle("Confirme");
        alerta2.setHeaderText(null);
        alerta2.setContentText("Deseja mesmo excluir o saldo da sua conta?");
        
        //Pegando qual o botao foi pressionado
        Optional<ButtonType> resposta = alerta2.showAndWait();
        
        //Verificar qual o botao pressionado
        if(resposta.get() == ButtonType.OK){ //pressionou o OK
            //faz alguma coisa
        }else{
            //faz outra coisa
        }
        
        //----------------
        
        //Caixa de Entrada de Dados
        TextInputDialog entrada = new TextInputDialog();
        entrada.setTitle("Responda");
        entrada.setHeaderText(null);
        entrada.setContentText("Qual dua idade?");
        
        //Pegando o que a pessoa digitou
        Optional<String> resposta2 = entrada.showAndWait();
        
        //Posso fazer o que quiser com a String
        System.out.println("A idade digitada foi:" + resposta2.get());
        
    }
    
}

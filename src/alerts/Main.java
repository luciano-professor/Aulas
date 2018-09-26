package alerts;


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    
    public void start(Stage stage) throws IOException{
        
        //Leitura do FXML
        Parent root = FXMLLoader.load(getClass().getResource("Alerts.fxml"));
        
        //Criação da cena
        Scene scene = new Scene(root);
        
        //Configuração da janela
        stage.setScene(scene);
        stage.show();
        
    }
    //Sempre fixo chamando a execucao do javafx
    public static void main(String[] args) {
        launch(args);
    } 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.Client;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Juan José Ramos
 */
public class Client {
     /*SINGLETON*/
    private static Client instance;
    public static Client getInstance(){
        if(instance == null){
            instance = new Client();
        }
        return instance;
    }
    /*---------------*/

    public Client() {
    }
    

    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Client.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {}
    }
    
    
}

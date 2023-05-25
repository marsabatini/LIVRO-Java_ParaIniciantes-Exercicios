package Cap_16.Exemplo0006;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TextFieldDemo extends Application {

    TextField tf;
    Label response;

    public static void main(String args[]){
        launch(args);
    }

    public void start(Stage myStage){

        myStage.setTitle("Demonstrate a TextField");

        FlowPane rootNode = new FlowPane(10, 10);

        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 230, 140);

        myStage.setScene(myScene);

        response = new Label("Enter Name: ");

        // Cria um botão para obtenćão do texto
        Button btnGetText = new Button("Get Name");

        tf = new TextField();

        // Define solicitaćão
        
    }
}

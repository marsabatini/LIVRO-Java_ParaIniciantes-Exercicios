package Cap_16.Exemplo0003;

    // Demonstra eventos e botões de JavaFX

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXEventDemo extends Application {


    public static void main(String[] args) {

        System.out.println("Lauching JavaFX application");

        // Inicializa o aplicativo JavaFx chamando launch()
        launch(args);
    }

    // Sobrepõe o método start()
    public void start(Stage myStage){

        // Fornece um título para o palco.
        myStage.setTitle("Use a JavaFX Buttons and Events.");

        // Usa um FlowPane para o nó raiz.
        // Nesse caso, lacunas horizontais e verticais de valor 10.
        FlowPane rootNode = new FlowPane(10, 10);

        // Centraliza os controles na cena
        rootNode.setAlignment(Pos.CENTER);


        // Cria uma cena
        Scene myScene = new Scene(rootNode, 300, 100);

        // Define a cena no palco
        myStage.setScene(myScene);

        // Cria um rótulo
        Label response = new Label("Push a Button.");

        //


        // Adiciona o rótulo ao grafo de cena
        rootNode.getChildren().add(btnUp, btnDown, response);

        // Exibe o palco
        myStage.show();
    }
}

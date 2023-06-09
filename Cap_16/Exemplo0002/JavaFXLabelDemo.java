package Cap_16.Exemplo0002;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXLabelDemo extends Application {

    public static void main(String[] args) {

        System.out.println("Lauching JavaFX application");

        // Inicializa o aplicativo JavaFx chamando launch()
        launch(args);
    }

    // Sobrepõe o método start()
    public void start(Stage myStage){

        // Fornece um título para o palco.
        myStage.setTitle("Use a JavaFX Label.");

        // Usa um FlowPane para o nó raiz
        FlowPane rootNode = new FlowPane();

        // Cria uma cena
        Scene myScene = new Scene(rootNode, 300, 200);

        // Define a cena no palco
        myStage.setScene(myScene);

        // Cria um rótulo
        Label myLabel = new Label("JavaFX is a powerful GUI.");

        // Adiciona o rótulo ao grafo de cena
        rootNode.getChildren().add(myLabel);

        // Exibe o palco
        myStage.show();
    }
}

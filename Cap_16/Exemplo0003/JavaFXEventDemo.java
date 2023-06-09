package Cap_16.Exemplo0003;

    // Demonstra eventos e botões de JavaFX

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        // Cria dois botões de aćão
        Button btnUp = new Button("Up");
        Button btnDown = new Button("Down");

        // Trata os eventos de acã́o do botão Up.
        btnUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                response.setText("You pressed Up.");
            }
        });

        // Trata os eventos de acã́o do botão Down.
        btnDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                response.setText("You pressed Down.");
            }
        });

        // Adiciona o rótulo ao grafo de cena
        rootNode.getChildren().addAll(btnUp, btnDown, response);

        // Exibe o palco
        myStage.show();
    }
}

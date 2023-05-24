package Cap_16.Exemplo0004;

    // Demonstra caixas de selećão

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class CheckBoxDemo extends Application {

    CheckBox cbSmartphone;
    CheckBox cbTablet;
    CheckBox cbNotebook;
    CheckBox cbDesktop;

    Label response;
    Label selected;

    String computers;


    public static void main(String[] args) {

        System.out.println("Lauching JavaFX application");

        // Inicializa o aplicativo JavaFx chamando launch()
        launch(args);
    }

    // Sobrepõe o método start()
    public void start(Stage myStage){

        // Fornece um título para o palco.
        myStage.setTitle("Demonstrate Check Boxes");

        // Usa um FlowPane para o nó raiz.
        // Nesse caso, lacunas horizontais e verticais de valor 10.
        FlowPane rootNode = new FlowPane(Orientation.HORIZONTAL, 10, 10);

        // Centraliza os controles na cena
        rootNode.setAlignment(Pos.CENTER);


        // Cria uma cena
        Scene myScene = new Scene(rootNode, 230, 200);

        // Define a cena no palco
        myStage.setScene(myScene);

        Label heading = new Label("What Computers do You Own?");

        // Cria um rótulo
        Label response = new Label("");

        // Cria um rótulo que listará todas as caixas de selećão marcadas
        Label selected = new Label("");

        // Cria as caixas de selećão


        // Adiciona o rótulo ao grafo de cena
        rootNode.getChildren().addAll(btnUp, btnDown, response);

        // Exibe o palco
        myStage.show();
    }
}

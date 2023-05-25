package Cap_16.Exemplo0008;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXEventDemo extends Application {

    Label response;


    public static void main(String[] args) {

        // Inicializa o aplicativo JavaFx chamando launch()
        launch(args);
    }

    // Sobrepõe o método start()
    public void start(Stage myStage){

        // Fornece um título para o palco.
        myStage.setTitle("Use Platforma exit.");

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
        Button btnRun = new Button("Run");
        Button btnExit = new Button("Exit");

        // Trata os eventos de acã́o do botão Run.
        btnRun.setOnAction( (ae) -> response.setText("You pressed Run."));

        // Trata os eventos de acã́o do botão Exit.
        btnExit.setOnAction( (ae) -> Platform.exit());

        // Adiciona o rótulo ao grafo de cena
        rootNode.getChildren().addAll(btnRun, btnExit, response);

        // Exibe o palco
        myStage.show();
    }
}

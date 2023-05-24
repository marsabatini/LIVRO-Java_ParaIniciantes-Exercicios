package Cap_16.Exemplo0004;

    // Demonstra caixas de selećão

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

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
        cbSmartphone = new CheckBox("Smartphne");
        cbTablet = new CheckBox("Tablet");
        cbNotebook = new CheckBox("Notebook");
        cbDesktop = new CheckBox("Desktop");

        // Trata eventos de aćão das caixas de selećão
        cbSmartphone.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(cbSmartphone.isSelected()){
                    response.setText("Smartphone was just selected.");
                } else {
                    response.setText("Smartphone was just cleared.");
                }

                showAll();
            }
        });

        cbTablet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(cbTablet.isSelected()){
                    response.setText("Tablet was just selected");
                } else {
                    response.setText("Tablet was just cleared.");
                }

                showAll();
            }
        });

        cbNotebook.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(cbNotebook.isSelected()){
                    response.setText("Notebook was just selected");
                } else {
                    response.setText("Notebook was just cleared.");
                }

                showAll();
            }
        });

        cbDesktop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(cbDesktop.isSelected()){
                    response.setText("Desktop was just selected");
                } else {
                    response.setText("Desktop was just cleared.");
                }

                showAll();
            }
        });

        // Adiciona o rótulo ao grafo de cena
        rootNode.getChildren().addAll(heading, cbSmartphone, cbTablet, cbNotebook, cbDesktop, response, selected);

        // Exibe o palco
        myStage.show();

        showAll();
    }

    // Atualiza e exibe as selećões
    void showAll(){
        computers = " ";
        if(cbSmartphone.isSelected())
            computers += "Smartphone ";
        if(cbTablet.isSelected())
            computers += "Tablet ";
        if(cbNotebook.isSelected())
            computers += "Notebook ";
        if(cbDesktop.isSelected())
            computers += "Desktop ";
    }
}

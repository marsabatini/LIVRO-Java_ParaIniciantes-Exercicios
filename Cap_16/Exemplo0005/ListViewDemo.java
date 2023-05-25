package Cap_16.Exemplo0005;

    // Demonstra uma exibićão de lista

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application {

    Label response;

    public static void main(String args[]){
        launch(args);
    }

    public void start(Stage myStage){

        // Fornece um título para o palco
        myStage.setTitle("ListView Demo");

        // Usa um FlowPane para o nó raiz.
        FlowPane rootNode = new FlowPane(10, 10);

        // Centraliza os controles da cena
        rootNode.setAlignment(Pos.CENTER);

        // Cria uma cena
        Scene myScene = new Scene(rootNode, 200, 120);

        // Define a cena no palco
        myStage.setScene(myScene);

        // Cria um rótulo
        response = new Label("Select Computer Type");

        // Cria uma ObservableList com as entradas da lista
        ObservableList<String> computerTypes =
                FXCollections.observableArrayList("Smartphone", "Tablet", "Notebook", "Desktop");

        // Cria a lista
        ListView<String> lvComputers = new ListView<String>(computerTypes);

        // Define os melhores tamanho e altura
        lvComputers.setPrefSize(100, 70);

        // Obtém o modelo de selećão da lista
        MultipleSelectionModel<String> lvSelModel =
                lvComputers.getSelectionModel();

        // Usa um ouvinte de alteraćões para responder a uma mudanća de selećão da lista
        lvSelModel.selectedItemProperty().addListener(
                new ChangeListener<String>() {
                    // Exibe selećão
                    @Override
                    public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal) {

                    }
                }
        );

        // Exibe o palco e sua cena
        myStage.show();
    }
}

package Cap_16.Exemplo0006;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
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
        tf.setPromptText("Enter a name.");

        // Define o número de colunas desejado.
        tf.setPrefColumnCount(15);

        /*
            Usa uma expressão lambda para tratar eventos de aćão do campo de
            texto. Eventos de aćão são gerados quando ENTER é pressionado
            enquanto o campo de text está com foco de recebimento
            de entrada. Nesse caso, o texto do campo é obtido e exibido.
         */
        tf.setOnAction( (ae) -> response.setText("Enter pressed. Name is: " +  tf.getText()));

        // Usa uma expressão lambda para obter o texto do campo quando o botão
        // é pressionado.
        btnGetText.setOnAction( (ae) -> response.setText("Button pressed. Name is: " + tf.getText()));

        Separator separator = new Separator();
        separator.setPrefWidth(180);

        rootNode.getChildren().addAll(tf, btnGetText, separator, response);

        myStage.show();
    }
}

package Cap_16.Exemplo0009;

    // Uma versão JavaFx do programa de comparaćão de arquivo mostrado
    // na sećão Tente isto 16-1

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class JavaFXFileComp extends Application {

    TextField tfFirst;
    TextField tfSecond;

    Button btnComp;

    Label labFirst;
    Label labSecond;
    Label labResult;

    public static void main(String args[]){
        launch(args);
    }
    public void start(Stage myStage) {

        // Fornece um título para o palco.
        myStage.setTitle("Compare Files.");

        // Usa um FlowPane para o nó raiz.
        // Nesse caso, lacunas horizontais e verticais de valor 10.
        FlowPane rootNode = new FlowPane(10, 10);

        // Centraliza os controles na cena
        rootNode.setAlignment(Pos.CENTER);

        // Cria uma cena
        Scene myScene = new Scene(rootNode, 180, 180);

        // Define a cena no palco
        myStage.setScene(myScene);

        tfFirst = new TextField();
        tfSecond = new TextField();

        tfFirst.setPrefColumnCount(12);
        tfSecond.setPrefColumnCount(12);

        tfFirst.setPromptText("Enter file name.");
        tfSecond.setPromptText("Enter file name.");

        btnComp = new Button("Compare");

        labFirst = new Label("First file: ");
        labSecond = new Label("Second file: ");
        labResult = new Label("");

        tfFirst.setOnAction( (ae) -> btnComp.fire());
        tfSecond.setOnAction( (ae) -> btnComp.fire());

        btnComp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int i = 0, j = 0;

                if(tfFirst.getText().equals("")){
                    labResult.setText("First file name missing.");
                    return;
                }
                if(tfSecond.getText().equals("")){
                    labResult.setText("Second file name missing");
                    return;
                }

                // Compara os arquivos.
                // Usa try-with-resources para gerenciá-los
                try(FileInputStream f1 = new FileInputStream(tfFirst.getText());
                    FileInputStream f2 = new FileInputStream(tfSecond.getText())){

                    // Verifica o conteúdo de cada arquivo
                    do{
                        i = f1.read();
                        j = f2.read();
                        if( i != j)
                            break;
                    } while (i != -1 && j != -1);

                    if(i != j)
                        labResult.setText("Files are not the same.");
                    else
                        labResult.setText("Files compare equal.");

                } catch(IOException exc){
                    labResult.setText("File Error Encountered.");
                }
            }
        });

        rootNode.getChildren().addAll(labFirst, tfFirst, labResult, tfSecond, btnComp, labResult);

        myStage.show();
    }
}

package Cap_16.Exemplo0007;

    // Demonstra a rotacao, o redimensionamento, a reflaxao e o desfoque.

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class EffectsAndTransformsDemo extends Application {

    double angle = 0.0;
    double scaleFactor = 0.4;
    double blurVal = 1.0;

    // Cria efeitos e transformaćões iniciais
    Reflection reflection = new Reflection();
    BoxBlur blur = new BoxBlur(1.0, 1.0, 1);
    Rotate rotate = new Rotate();
    Scale scale = new Scale(scaleFactor, scaleFactor);

    // Cria botões
    Button btnRotate = new Button("Rotate");
    Button btnBlur = new Button("Blur Off");
    Button btnScale = new Button("Scale");

    Label reflect = new Label("Reflection Adds Visual Sparkle.");

    public static void main(String args[]){
        launch(args);
    }

    public void start(Stage myStage){

        myStage.setTitle("Effects and Transforms Demo.");

        FlowPane rootNode = new FlowPane(20, 20);

        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 120);

        myStage.setScene(myScene);

        btnRotate.getTransforms().add(rotate);

        btnScale.getTransforms().add(scale);

        // Define o efeito de reflexão no rótulo
        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);
        reflect.setEffect(reflection);

        // Trata os eventos de aćão do botão Rotate
        btnRotate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // Sempre que o botão é pressionado, ele é girado 30 graus
                // ao redor de seu centro.
                angle += 15.0;

                rotate.setAngle(angle);
                rotate.setPivotX(btnRotate.getWidth() / 2);
                rotate.setPivotY(btnRotate.getHeight() / 2);
            }
        });

        btnScale.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                scaleFactor += 0.1;
                if(scaleFactor > 2.0)
                    scaleFactor = 0.4;

                scale.setX(scaleFactor);
                scale.setY(scaleFactor);
            }
        });

        btnBlur.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // Sempre que o botão é pressionado, seu status de desfoque muda.
                if(blurVal == 10.0){
                    blurVal = 1.0;
                    btnBlur.setEffect(null);
                    btnBlur.setText("Blur off");
                } else {
                    blurVal++;
                    btnBlur.setEffect(blur);
                    btnBlur.setText("Blur on");
                }
                blur.setWidth(blurVal);
                blur.setHeight(blurVal);
            }
        });

        rootNode.getChildren().addAll(btnRotate, btnScale, btnBlur, reflect);

        myStage.show();
    }
}

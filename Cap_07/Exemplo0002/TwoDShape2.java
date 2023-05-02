package Cap_07.Exemplo0002;

// Usa métodos acessadores para configurar e examinar membros privados
// Uma classe para objetos bidimensionais
public class TwoDShape2 {

    private double width;   // agora, esses
                            //
    private double height;  // são membros privados

    // Métodos acessadores para width e height
    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }

    void setWidth(double w){
        width = w;
    }

    void setHeight(double h){
        height = h;
    }

    void showDim(){
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}

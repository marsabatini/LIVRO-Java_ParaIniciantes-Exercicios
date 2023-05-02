package Cap_07.Exemplo0003;

// Adiciona um construtor para Triangle
// Uma classe para objetos bidimensionais
public class TwoDShape3 {

    private double width;
    private double height;

    // Membros acessadores;
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
        System.out.println("Width and height are " + width + " and " + height);
    }
}

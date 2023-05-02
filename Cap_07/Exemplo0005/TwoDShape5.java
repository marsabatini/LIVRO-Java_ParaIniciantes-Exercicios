package Cap_07.Exemplo0005;

// Adiciona mais construtores a TwoDShape
public class TwoDShape5 {

    private double width;

    private double height;

    // Construtor padrão
    TwoDShape5(){
        width = height = 0.0;
    }

    // Construtor parametrizado
    TwoDShape5(double w, double h){
        width = w;
        height = h;
    }

    // Constrói o objeto com altura e largura iguais.
    TwoDShape5(double x){
        width = height = x;
    }

    // Métodos acessadores (getters and setters)

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}

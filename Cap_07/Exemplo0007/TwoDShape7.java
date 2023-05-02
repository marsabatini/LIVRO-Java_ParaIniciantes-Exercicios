package Cap_07.Exemplo0007;

// Hierarquia de vários níveis
public class TwoDShape7 {

    private double width;

    private double height;

    // Construtor padrão
    TwoDShape7(){
        width = height = 0.0;
    }

    // Construtor parametrizado
    TwoDShape7(double w, double h){
        width = w;
        height = h;
    }

    // Constrói o objetco com largura e altura iguais;
    TwoDShape7(double x){
        width = height = x;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}

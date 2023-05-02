package Cap_07.Exemplo0008;

public class TwoDShapes8 {

    private double width;

    private double height;

    TwoDShapes8(){
        width = height = 0.0;
    }

    TwoDShapes8(double w, double h){
        width = w;
        height = h;
    }

    TwoDShapes8(double x){
        width = height = x;
    }

    // Constrói um objeto a partir de outro
    TwoDShapes8(TwoDShapes8 ob){
        width = ob.width;
        height = ob.height;
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

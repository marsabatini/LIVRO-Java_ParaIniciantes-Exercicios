package Cap_07.Exemplo0011;

abstract class TwoDShape11 {

    private double width;
    private double height;
    private String name;

    TwoDShape11(){
        width = height = 0.0;
        name = "none";
    }

    TwoDShape11(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }

    // Constrói objetos com largura e altura iguais
    TwoDShape11(double x, String n){
        width = height = x;
        name = n;
    }

    // Constrói um objeto a partir de outro
    TwoDShape11(TwoDShape11 ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Getters and Setters

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void showDim(){
        System.out.println("Width and height are" + width + " and " + height);
    }

    // Agora area() é abstrato.
    abstract double area(); // Transforma area() em um método abstrato
}

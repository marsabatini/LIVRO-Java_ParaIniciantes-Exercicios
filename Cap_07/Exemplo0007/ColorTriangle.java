package Cap_07.Exemplo0007;

// Estende Triangle7
public class ColorTriangle extends Triangle7{

    private String color;

    ColorTriangle(String c, String s, double w, double h){
         super(s, w, h);

         color = c;
    }

    String getColor(){
        return color;
    }

    void showColor(){
        System.out.println("Color is " + color);
    }

}

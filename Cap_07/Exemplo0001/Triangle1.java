package Cap_07.Exemplo0001;

    // Uma subclasse de TwoDShape para triângulos
    // Herda de TwoDShape
public class Triangle1 extends TwoDShape1 {


    String style;

    double area(){
        return width * height / 2;      // Triangle pode referenciar os membros de TwoDShape como se fossem seus
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

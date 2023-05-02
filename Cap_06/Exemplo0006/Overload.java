package Cap_06.Exemplo0006;

    // Demonstra a sobrecarga de métodos
public class Overload {

    // Primeira versão do método
    void ovlDemo(){
        System.out.println("No parameters.");
    }

    // Sobrecarga de ovlDemo para um parâmetro inteiro
    void ovlDemo(int a){
        System.out.println("One parameter: " + a);
    }

    // Sobrecarga de ovlDemo para dois parâmetros inteiros
    int ovlDemo(int a, int b){
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    // Sobrecarga de ovlDemo para dois parâmetros double.
    double ovlDemo(double a, double b){
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }
}

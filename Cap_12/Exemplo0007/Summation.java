package Cap_12.Exemplo0007;

    // Usa um construtor genérico

public class Summation {

    private int sum;

    <T extends Number> Summation(T arg){
        sum = 0;

        for(int i = 0; i <= arg.intValue(); i++){
            sum += i;
        }
    }

    int getSum(){
        return sum;
    }
}

package Cap_09.Exemplo0015;

    /*
        Usa o recurso multi-catch.

        NOTA: este código requer JDK 7 ou superir para ser compilado
    */

public class MultiCatch {

    public static void main(String args[]){

        int a = 88, b = 0;
        int result;
        char chrs[] = { 'A', 'B', 'C'};

        for(int i = 0; i < 2; i++){
            try{
                if(i == 0)
                    result = a / b; // gera uma ArithmeticException
                else
                    chrs[5] = 'X';  // gera uma ArrayIndexOutOfBoundsException
            }
            // A seguir, a cláusula catch captura ambas excecões
            catch (ArithmeticException | ArrayIndexOutOfBoundsException exception){
                System.out.println("Exception caught: " + exception);
            }
        }
        System.out.println("After multi-catch.");
    }
}

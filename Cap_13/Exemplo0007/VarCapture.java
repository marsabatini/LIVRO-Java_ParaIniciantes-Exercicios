package Cap_13.Exemplo0007;

public class VarCapture {

    public static void main(String[] args) {

        // Uma variável local que pode ser capturada.
        int num = 10;

        MyFunc myLambda = (n) -> {

            // Este uso de num está correto. Ele não modifica num.
            int v = num + n;

            // Porém, a instrućão a seguir não é válida
            // porque tenta modificar o valor de num,
            // numm++;

            return v;
        };

        // Usa a express lambda. Esta instrućão exibirá 18.
        System.out.println(myLambda.func(8));

        // A linha a seguir também causaria um erro, porque
        // removeria de num o status de efetivamente final.
        // num = 9;
    }
}

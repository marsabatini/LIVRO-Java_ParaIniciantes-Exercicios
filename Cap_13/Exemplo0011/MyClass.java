package Cap_13.Exemplo0011;

public class MyClass {

    private String str;

    // Este construtor recebe um argumento.
    MyClass(String s){

        str = s;

    }

    // Este é o construtor padrão.
    MyClass(){

        str = "";

    }

    String getStr(){

        return str;

    }
}

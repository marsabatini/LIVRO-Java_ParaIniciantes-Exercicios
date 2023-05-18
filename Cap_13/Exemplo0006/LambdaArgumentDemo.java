package Cap_13.Exemplo0006;

public class LambdaArgumentDemo {

    /*
        Este método tem uma interface funcnional como tipo de seu
        primeiro parâmetro. Logo, pode receber uma referência a
        qualquer instância dessa interface, inclusive uma instância
        criada por uma expressão lambda. O segundo parâmetro
        especifica o string a ser alterado.
     */
    static String changeStr(StringFunc st, String s){
        return st.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Lambda Expressions Expand Java";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        // Define uma expressão lambda que inverte o conteúdo de uma
        // string e a atribui a uma variável de referência StringFunc.
        StringFunc reverse = (str) ->{
            String result = "";

            for(int i = str.length()-1; i >= 0; i--){
                result += str.charAt(i);
            }
            return result;
        };

        // Passa reverse como primeiro argumento de changeStr().
        // Passa a string de entrada como segundo argumento.
        outStr = changeStr(reverse, inStr);
        System.out.println("The string reversed: " + outStr);

        // Esta expressão lambda substitui espaćos por hífens.
        // Ela está embutida diretamente na chamada a changeStr().
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("The string with spaces replaced: " + outStr);

        // Esta lambda de bloco inverte a caixa dos caracteres da string.
        // Ela também está embutida diretamente na chamada a changeStr().
        outStr = changeStr((str) -> {
            String result = "";
            char ch;

            for(int i = 0; i < str.length(); i++){
                ch = str.charAt(i);
                if(Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            return result;
        }, inStr);

        System.out.println("The string in reversed case: " + outStr);
    }
}

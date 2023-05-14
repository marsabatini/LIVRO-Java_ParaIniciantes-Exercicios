package Cap_11.Exemplo0009;

    // Autoboxing/unboxing ocorre dentro de expressões

public class AutoBox3 {
    public static void main(String[] args) {

        Integer iOb, iOb2;
        int i;

        iOb = 99;
        System.out.println("Original value of iOb: " + iOb);

        // O techo a seguir faz o unboxing automático
        // de iOb, executa o incremento e encapsula o
        // resultado novamente em iOb;
        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        // Aqui, iOb sofre unboxing. Seu valor é aumentado em
        // 10 e o resultado é encapsulado e armazenado nova-
        // mente em iOb.
        iOb += 10;
        System.out.println("After iOb += 10: " + iOb);

        // Agora, iOb sobre unboxing. A expressão é
        // avaliada e o resultado é encapsulado novamente,
        // além de ser atribuído a iOb2.
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after expression: " + iOb2);

        // A mesma expressão é avalada, mas o resultado
        // não é encapsulado.
        i = iOb + (iOb / 3);
        System.out.println("i after expression: " + i);
    }
}

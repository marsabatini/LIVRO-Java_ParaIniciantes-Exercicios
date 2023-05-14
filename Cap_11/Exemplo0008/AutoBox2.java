package Cap_11.Exemplo0008;

// O autoboxing/unboxing ocorre com parâmetro
// e os valores de retorno de métodos.
public class AutoBox2 {

    // Esse método tem um parâmetro Integer.
    static void m(Integer v) {
        System.out.println("m() received " + v);
    }

    // Esse método retorna um int.
    static int m2(){
        return 10;
    }

    // Esse método retorna uma Integer.
    static Integer m3(){
        return 99;      // faz o autoboxing de 99 para um Integer.
    }

    public static void main(String[] args) {

        // Passa um int para m().
        // Já que m() tem um parâmetro Integer,
        // o valor int passado é encapsulado automaticamente.
        m(199);

        // Aqui, iOb recebe o valor int retornado por m2().
        // Esse valor é encapsulado automaticamente para
        // poder ser atribuído a iOb.
        Integer iOb = m2();
        System.out.println("Return value from m2() is " + iOb);

        // Em seguida, m3() é chamado.
        // Ele retorna um valor Integer
        // que é encapsulado automaticamente em um int.
        int i = m3();
        System.out.println("Return value from m3() is " + i);

        // Agora, Math.sqrt() é chamadmo com iOb como argumento.
        // Nesse caso, iOb sobre autounboxing e seu valor é promovido
        // a double, que é o tipo que sqrt() precisa.
        iOb = 100;
        System.out.println("Square root of iOb is " + Math.sqrt(iOb));
    }
}

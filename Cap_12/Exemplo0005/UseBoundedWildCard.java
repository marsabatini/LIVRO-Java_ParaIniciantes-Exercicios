package Cap_12.Exemplo0005;

    // Aqui, o símbolo ? equivalerá a A ou
    // a qualquer tipo de classe que estenda A.


public class UseBoundedWildCard {

    public static void main(String args[]){

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> w = new Gen<A>(a);
        Gen<B> w2 = new Gen<B>(b);
        Gen<C> w3 = new Gen<C>(c);
        Gen<D> w4 = new Gen<D>(d);

        // Estas chamadas test() estão corretas.
        // test(w);
        // test(w2);
        // test(w3);

        // Não pode chamar test() com w4 porque
        // ele não é um objeto de uma classe que herda A.
        // test(w4)
    }

}

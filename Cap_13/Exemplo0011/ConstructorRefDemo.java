package Cap_13.Exemplo0011;

public class ConstructorRefDemo {

    public static void main(String args[]) {

        // Cria uma referência ao construtor de MyClass.
        // Já que o método func() de MyFunc recebe um argumento,
        // new referencia o construtor parametrizado de MyClass
        // e não o construtor padrão.
        MyFunc myClassCons = MyClass::new;          // Uma referência de construtor

        // Cria uma instância de MyClass usando essa
        // referência de construtor
        MyClass mc = myClassCons.func("Testing");

        // Usa a instância de MyClass recém criada.
        System.out.println("str in mc is " + mc.getStr());
    }
}

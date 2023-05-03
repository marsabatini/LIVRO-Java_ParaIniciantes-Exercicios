package Cap_08.Exemplo0009;

    // Usa o método padrão

public class DefaultMethodDemo {

    public static void main(String args[]){

        MyIFImpl obj = new MyIFImpl();
        MyIFImp2 obj2 = new MyIFImp2();

        // Pode chamar o método getUserID(), porque
        // ele é implementado explicitamente por MyIFImp
        System.out.println("User ID is " + obj.getUserID());

        // Também pode chamar getAdminID(), por causa da
        // implementaćão padrão.
        System.out.println("Administrator ID is " + obj.getAdminID());

        System.out.println("Administrator ID is " + obj2.getAdminID());

    }
}

package Cap_08.Exemplo0002.bookpack;

    // Book recodificado para acesso público.

public class Book {

    private String title;
    private String author;
    private int pubData;

    // Agora é pública.
    public Book (String t, String a, int d){
        title = t;
        author = a;
        pubData = d;
    }

    // Agora é público
    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubData);
        System.out.println();
    }
}

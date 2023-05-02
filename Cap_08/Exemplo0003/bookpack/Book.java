package Cap_08.Exemplo0003.bookpack;

    // Protected: torna as variáveis de instância protegidas

public class Book {

    protected String title;
    protected String author;
    protected int pubDate;

    public Book(String t, String a, int d){
        title = t;
        author = a;
        pubDate = d;
    }

    public void show(){
        System.out.println();
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

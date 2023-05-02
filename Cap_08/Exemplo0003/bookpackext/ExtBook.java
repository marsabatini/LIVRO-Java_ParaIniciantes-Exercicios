package Cap_08.Exemplo0003.bookpackext;

    // Demonstra a utilizacão de Protected
    /*
        De acordo com Schildt, o uso de "protected" pode causar alguma confusão, afinal
        ele cria um membro protegido que pode ser acessado apenas a partir de seu próprio
        pacote e de suas subclasses.
    */

import Cap_08.Exemplo0003.bookpack.Book;

public class ExtBook extends Book {

    private String publisher;

    public ExtBook(String t, String a, int d, String p){
        super(t, a, d);
        publisher = p;
    }

    public void show(){
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher(){
        return publisher;
    }

    public void setPublisher(String p){
        publisher = p;
    }

    /*
        As instrućões a seguir estão corretas, pois subclasses podem acessar um membro protegido
     */
    public String getTitle(){
        return title;
    }

    public void setTitle(String t){
        title = t;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String a){
        author = a;
    }

    public int getPubDate(){
        return pubDate;
    }

    public void setPubDate(int d){
        pubDate = d;
    }
}

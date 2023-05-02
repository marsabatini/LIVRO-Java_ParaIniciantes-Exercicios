package Cap_08.Exemplo0002.bookpackext;

    // Classe em outro pacote.


import Cap_08.Exemplo0002.bookpack.Book;

public class Bookpackext {

    public static void main(String args[]){

        Book books[] = new Book[5];

        books[0] = new Cap_08.Exemplo0002.bookpack.Book("Java: A Beginner's Guide", "Schildt", 2014);
        books[1] = new Cap_08.Exemplo0002.bookpack.Book("Java: The Complete Reference", "Schildt", 2014);
        books[2] = new Cap_08.Exemplo0002.bookpack.Book("The Art of Java", "Schildt and Holmes", 2003);
        books[3] = new Cap_08.Exemplo0002.bookpack.Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new Cap_08.Exemplo0002.bookpack.Book("On the Road", "Kerouac", 1955);

        for(int i = 0; i < books.length; i++){
            books[i].show();
        }

    }
}

package Book;

import java.util.ArrayList;
import java.util.List;

public class BookCollenction  {
    private List<Book> HashSet = new ArrayList<>();

    public void addBook(Book newBook){
        this.HashSet.add(newBook);
    }

    public void removeBook (Book newBook){
        this.HashSet.remove(newBook);
    }

    public boolean consistBook(Book newBook) {
        for (Book book : HashSet) {
            if (book.equals(newBook)) {
                return true;
            }
        }
        return false;
    }
    public void printBooks() {
        for (Book book : HashSet) {
            System.out.print("\n" + book.getName());
        }
    }

}

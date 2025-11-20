package Library.model;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reader extends Person {

    private Membership membership;
    private List<Book> borrowedBooks = new ArrayList<>();

        public Reader(int id, String name, Membership membership){
        super(id, name);
        this.membership = membership;
        }


    @Override
    public String whoYouAre() {
        return "Reader: " + getName();
    }

    public Membership getMembership() {
        return membership;
    }

    public List<Book> getBorrowedBooks() {
        return Collections.unmodifiableList(borrowedBooks);
    }

    public boolean canBorrowMore(){
        return borrowedBooks.size() < membership.getMaxBookLimit();
    }

    public boolean borrowBook(Book book) {
        if (!canBorrowMore()) return false;
        borrowedBooks.add(book);
        return true;
    }

    public boolean returnBook(Book book) {
        return borrowedBooks.remove(book);
    }

    public int getBorrowedCount(){
        return borrowedBooks.size();
    }
}

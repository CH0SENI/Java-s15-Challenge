package Library.model;

import java.util.*;

public class Library {

    //composition

    private Set<Book> books = new HashSet<>();
    private Map<Integer, Reader> readers = new HashMap<>();
    private Map<Integer, Librarian> librarians = new HashMap<>();
    private Map<Integer, Invoice> activeInvoicesByBookId = new HashMap<>();
    private List<Invoice> allInvoices = new ArrayList<>();

    public Map<Integer, Reader> getReaders() {
        return readers;
    }

    public Map<Integer, Librarian> getLibrarians() {
        return librarians;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public List<Invoice> getAllInvoices() {
        return allInvoices;
    }

    public Map<Integer, Invoice> getActiveInvoicesByBookId() {
        return activeInvoicesByBookId;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void addReader(Reader reader){
        readers.put(reader.getId(), reader);
    }

    public void addLibrarian(Librarian librarian){
        librarians.put(librarian.getId(), librarian);
    }

    public void addInvoice(Invoice invoice){
        allInvoices.add(invoice);
        activeInvoicesByBookId.put(invoice.getBook().getId(), invoice);
    }

    public void closeInvoiceForBook(Book book){
        Invoice invoice = activeInvoicesByBookId.remove(book.getId());
        if (invoice !=null){
            invoice.refund();
        }
    }
}

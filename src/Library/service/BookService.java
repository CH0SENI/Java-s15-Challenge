package Library.service;

import Library.model.Author;
import Library.model.Book;
import Library.model.Category;
import Library.model.Library;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class BookService implements Searchable {

    private Library library;

    public BookService(Library library){
        this.library = library;
    }

    public Book addBook(int id, String title, Author author, Category category){
        Book book = new Book(id, title, author, category, LocalDate.now());
        library.addBook(book);
        return book;
    }

    public boolean removeBook(int id){
        Book b = findById(id);
        if (b == null) return false;
        library.removeBook(b);
        return true;
    }

    public boolean updateBook(int id, String newTitle, Author newAuthor, Category newCategory){
        Book b = findById(id);
        if (b == null) return false;
        if (newTitle !=null && !newTitle.isEmpty() b.setTitle(newTitle);
        if (newAuthor !=null) b.setAuthor(newAuthor);
        if (newCategory !=null) b.setCategory(newCategory);
        return true;
    }

    public Book findById(int id){
        for (Book b : library.getBooks()) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    public List<Book> findByTitle(String title) {
        return library.getBooks().stream().filter(b -> b.getTitle().toLowerCase().contains(title.toLowerCase())).collect(Collectors.toList());
    }


}

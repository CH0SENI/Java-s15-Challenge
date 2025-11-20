package Library.model;

import java.time.LocalDate;

public class Book {
    private int id;
    private String title;
    private Author author;
    private Category category;
    private boolean available;
    private Reader currentOwner;
    private LocalDate dateOfPurchase;

    public Book(Author author, boolean available, Category category, Reader currentOwner, int id, LocalDate dateOfPurchase, String title) {
        this.author = author;
        this.available = available;
        this.category = category;
        this.currentOwner = currentOwner;
        this.id = id;
        this.dateOfPurchase = dateOfPurchase;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return available;
    }

    public Reader getCurrentOwner() {
        return currentOwner;
    }

    public void lendTo(Reader reader) {
        this.currentOwner = reader;
        this.available = false;
    }

    public void takeBack(){
        this.currentOwner = null;
        this.available = true;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    @Override
    public String toString() {
        return "Book{" +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", category=" + category +
                ", available=" + available +
                '}';
    }
}

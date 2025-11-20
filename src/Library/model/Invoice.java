package Library.model;

import java.time.LocalDate;

public class Invoice {

    private int id;
    private Reader reader;
    private Book book;
    private double amount;
    private LocalDate date;
    private boolean refunded;

    public Invoice(double amount, Book book, LocalDate date, int id, Reader reader, boolean refunded) {
        this.amount = amount;
        this.book = book;
        this.date = date;
        this.id = id;
        this.reader = reader;
        this.refunded = refunded;
    }

    public double getAmount() {
        return amount;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getDate() {
        return date;
    }

    public Reader getReader() {
        return reader;
    }

    public boolean isRefunded() {
        return refunded;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "amount=" + amount +
                ", id=" + id +
                ", reader=" + reader +
                ", book=" + book +
                ", date=" + date +
                ", refunded=" + refunded +
                '}';
    }
}

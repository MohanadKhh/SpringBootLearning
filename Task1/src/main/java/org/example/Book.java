package org.example;

import java.util.Map;
import java.util.Objects;

public class Book {
    private static int counter = 0;
    private int id = counter++;
    private String title;
    private String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void addLoanBook(Map<Integer, Book> loanedBooks) {
        loanedBooks.put(this.getId(), this);
    }

    public void returnLoanBook(Map<Integer, Book> loanedBooks) {
        if(loanedBooks.containsKey(this.getId())) {
            loanedBooks.remove(this.getId());
        }
        else{
            System.out.println("warning !! - Book with ID (" + this.getId() + ") is not in the loaned list");
        }
    }

    public static void printLoanBook(Map<Integer, Book> loanedBooks) {
        loanedBooks.forEach((k, v) -> {
            System.out.println(k + "\t" + v);
        });
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

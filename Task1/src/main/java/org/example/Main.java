package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Book> books = getIntegerBookMap();

        Map<Integer, Book> loanedBooks = new HashMap<>();

        books.get(0).addLoanBook(loanedBooks);
        books.get(1).addLoanBook(loanedBooks);
        Book.printLoanBook(loanedBooks);
        System.out.println("-----------------------");

        books.get(2).addLoanBook(loanedBooks);
        books.get(3).addLoanBook(loanedBooks);
        Book.printLoanBook(loanedBooks);
        System.out.println("-----------------------");

        books.get(0).returnLoanBook(loanedBooks);
        books.get(1).returnLoanBook(loanedBooks);
        Book.printLoanBook(loanedBooks);
        System.out.println("-----------------------");

        books.get(4).addLoanBook(loanedBooks);
        books.get(5).addLoanBook(loanedBooks);
        books.get(6).addLoanBook(loanedBooks);
        books.get(7).addLoanBook(loanedBooks);
        Book.printLoanBook(loanedBooks);
        System.out.println("-----------------------");

        books.get(0).returnLoanBook(loanedBooks);
        books.get(7).returnLoanBook(loanedBooks);
        Book.printLoanBook(loanedBooks);
        System.out.println("-----------------------");
    }

    private static Map<Integer, Book> getIntegerBookMap() {
        Map<Integer, Book> books = new HashMap<>();

        Book book1 = new Book("Spring Boot", "Mohanad");
        Book book2 = new Book("AI", "Honda");
        Book book3 = new Book("Embedded Systems", "Loay");
        Book book4 = new Book("Web Development", "Hossam");
        Book book5 = new Book("Verilog HDL", "Nader");
        Book book6 = new Book("Data Structures", "Sarah");
        Book book7 = new Book("Machine Learning", "Omar");
        Book book8 = new Book("Cybersecurity Basics", "Lina");
        Book book9 = new Book("Database Management", "Ahmed");
        Book book10 = new Book("Cloud Computing", "Youssef");

        books.put(book1.getId(), book1);
        books.put(book2.getId(), book2);
        books.put(book3.getId(), book3);
        books.put(book4.getId(), book4);
        books.put(book5.getId(), book5);
        books.put(book6.getId(), book6);
        books.put(book7.getId(), book7);
        books.put(book8.getId(), book8);
        books.put(book9.getId(), book9);
        books.put(book10.getId(), book10);
        return books;
    }
}

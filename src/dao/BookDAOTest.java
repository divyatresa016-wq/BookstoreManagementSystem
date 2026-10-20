
package dao;

import Model.Book;
import java.sql.SQLException;
import java.util.List;

public class BookDAOTest {

    public static void main(String[] args) {

        BookDAO bookDAO = new BookDAO();

        try {
            Book book = new Book(
                0,
                "The Alchemist",
                "Paulo Coelho",
                "Fiction",
                350.00,
                10
            );

            boolean added = bookDAO.addBook(book);

            if (added) {
                System.out.println("Book added successfully!");
            }

            List<Book> books = bookDAO.getAllBooks();

            System.out.println("\nAvailable Books:");

            for (Book b : books) {
                System.out.println(
                    b.getBookId() + " | "
                    + b.getTitle() + " | "
                    + b.getAuthor() + " | "
                    + b.getPrice() + " | "
                    + b.getStock()
                );
            }

        } catch (SQLException e) {
            System.out.println("Database operation failed!");
            e.printStackTrace();
        }
    }
}


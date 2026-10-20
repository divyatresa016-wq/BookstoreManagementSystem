
package dao;

import Model.Purchase;
import Model.Bill;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PurchaseDAOTest {

    public static void main(String[] args) {

        PurchaseDAO purchaseDAO = new PurchaseDAO();

        try {
            // Use existing customer and book IDs from your database.
            int customerId = 1;
            int bookId = 1;

            List<Bill> items = new ArrayList<>();

            // Purchase 2 copies of book ID 1
            items.add(new Bill(
                0, 0, bookId, 2, 0.0
            ));

            int purchaseId =
                purchaseDAO.createPurchase(customerId, items);

            System.out.println("Purchase successful!");
            System.out.println("Purchase ID: " + purchaseId);

            System.out.println("\nPurchase History:");

            List<Purchase> purchases =
                purchaseDAO.getAllPurchases();

            for (Purchase p : purchases) {
                System.out.println(
                    "Purchase ID: " + p.getPurchaseId()
                    + " | Customer ID: " + p.getCustomerId()
                    + " | Date: " + p.getPurchaseDate()
                    + " | Total: " + p.getTotalAmount()
                );
            }

        } catch (SQLException | IllegalArgumentException e) {
            System.out.println("Purchase failed: " + e.getMessage());
        }
    }
}


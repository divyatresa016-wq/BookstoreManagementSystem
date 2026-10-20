
package dao;

import Model.Customer;
import java.sql.SQLException;
import java.util.List;

public class CustomerDAOTest {

    public static void main(String[] args) {

        CustomerDAO customerDAO = new CustomerDAO();

        try {
            Customer customer = new Customer(
                0,
                "Divya Thomas",
                "divya.thomas@gmail.com",
                "9876543210"
            );

            boolean added = customerDAO.addCustomer(customer);

            if (added) {
                System.out.println("Customer added successfully!");
            }

            List<Customer> customers =
                    customerDAO.getAllCustomers();

            System.out.println("\nCustomer List:");

            for (Customer c : customers) {
                System.out.println(
                    c.getCustomerId() + " | "
                    + c.getName() + " | "
                    + c.getEmail() + " | "
                    + c.getPhone()
                );
            }

        } catch (SQLException e) {
            System.out.println("Database operation failed!");
            e.printStackTrace();
        }
    }
}

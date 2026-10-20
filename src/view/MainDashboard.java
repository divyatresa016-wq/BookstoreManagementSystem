

package view;

import javax.swing.*;
import java.awt.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.*;

public class MainDashboard extends JFrame {

    public MainDashboard() {

        setTitle("Bookstore Management System");
        setSize(900, 600);
        setMinimumSize(new Dimension(800, 550));
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(248, 247, 241));

     // Application heading
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(35, 76, 58));
        headerPanel.setBorder(
                BorderFactory.createEmptyBorder(25, 30, 25, 30)
        );

        JLabel heading = new JLabel("BOOKSTORE MANAGEMENT SYSTEM");
        heading.setFont(new Font("SansSerif", Font.BOLD, 28));
        heading.setForeground(Color.WHITE);

        JLabel subtitle = new JLabel(
                "Manage your books, customers and purchases"
        );
        subtitle.setFont(new Font("SansSerif", Font.PLAIN, 13));
        subtitle.setForeground(new Color(220, 232, 222));

        JPanel headingText = new JPanel();
        headingText.setLayout(new BoxLayout(headingText, BoxLayout.Y_AXIS));
        headingText.setBackground(new Color(35, 76, 58));

        headingText.add(heading);
        headingText.add(Box.createVerticalStrut(6));
        headingText.add(subtitle);

        headerPanel.add(headingText, BorderLayout.WEST);
        add(headerPanel, BorderLayout.NORTH);

        // Main menu options
        JPanel menuPanel = new JPanel(new GridLayout(4, 1, 12, 16));

        menuPanel.setBorder(
                BorderFactory.createEmptyBorder(20, 120, 30, 120)
        );

        JButton booksButton = new JButton("1. Manage Books");
        JButton customersButton = new JButton("2. Manage Customers");
        JButton purchasesButton = new JButton("3. Manage Purchases");
        JButton exitButton = new JButton("4. Exit");
     // Style navigation buttons
        Font buttonFont = new Font("SansSerif", Font.BOLD, 18);

        booksButton.setFont(buttonFont);
        customersButton.setFont(buttonFont);
        purchasesButton.setFont(buttonFont);
        exitButton.setFont(buttonFont);

        booksButton.setFocusPainted(false);
        customersButton.setFocusPainted(false);
        purchasesButton.setFocusPainted(false);
        exitButton.setFocusPainted(false);

        menuPanel.add(booksButton);
        menuPanel.add(customersButton);
        menuPanel.add(purchasesButton);
        menuPanel.add(exitButton);

        add(menuPanel, BorderLayout.CENTER);
     // Button colours - beige and cream theme
        Color buttonBeige = new Color(232, 220, 200);
        Color buttonText = new Color(65, 55, 45);

        // Management buttons
        booksButton.setBackground(buttonBeige);
        customersButton.setBackground(buttonBeige);
        purchasesButton.setBackground(buttonBeige);

        booksButton.setForeground(buttonText);
        customersButton.setForeground(buttonText);
        purchasesButton.setForeground(buttonText);

        // Exit button - slightly darker beige
        exitButton.setBackground(new Color(215, 198, 173));
        exitButton.setForeground(buttonText);

        // Consistent button borders and padding
        booksButton.setBorder(
                BorderFactory.createEmptyBorder(12, 20, 12, 20));
        customersButton.setBorder(
                BorderFactory.createEmptyBorder(12, 20, 12, 20));
        purchasesButton.setBorder(
                BorderFactory.createEmptyBorder(12, 20, 12, 20));
        exitButton.setBorder(
                BorderFactory.createEmptyBorder(12, 20, 12, 20));

        booksButton.setOpaque(true);
        customersButton.setOpaque(true);
        purchasesButton.setOpaque(true);
        exitButton.setOpaque(true);

        // Open Book Menu
        booksButton.addActionListener(e -> {
            BookManagement bookManagement = new BookManagement();
            bookManagement.setVisible(true);
        });

        // Open Customer Menu
        customersButton.addActionListener(e -> {
            CustomerManagement customerManagement =
                    new CustomerManagement();

            customerManagement.setVisible(true);
        });

        // Open Purchase Menu
        purchasesButton.addActionListener(e -> {
            PurchaseManagement purchaseManagement =
                    new PurchaseManagement();

            purchaseManagement.setVisible(true);
        });

        // Exit confirmation
        exitButton.addActionListener(e -> exitApplication());

        // Handle the window close button
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(
                    java.awt.event.WindowEvent e) {
                exitApplication();
            }
        });
    }

    private void exitApplication() {

        int choice = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to exit?",
                "Confirm Exit",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (choice == JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            FlatLightLaf.setup();

            MainDashboard dashboard = new MainDashboard();
            dashboard.setVisible(true);

        });
    }
}

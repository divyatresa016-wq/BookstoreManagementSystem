# Bookstore Management System

A desktop-based Bookstore Management System developed using **Java Swing** and **MySQL**.

## Features
- Manage book records
- Manage customer records
- Record purchases and purchase items
- Store and retrieve data using a MySQL database
- User interface styled using FlatLaf

## Technologies Used
- Java
- Java Swing
- MySQL
- JDBC
- FlatLaf
- Eclipse IDE

## Database
The project uses a MySQL database named 'bookstore_db' with the following tables:
- books
- customers
- purchases
- purchase_items

The database schema is provided in 'bookstore_db.sq'.

## Setup
1. Install Java and MySQL.
2. Run the SQL commands in 'bookstore_db.sql' to create the database and tables.
3. Configure the MySQL connection using the 'BOOKSTORE_DB_PASSWORD' environment variable.
4. Import the project into Eclipse and ensure the required FlatLaf library is added to the project's build path.
5. Run the application's main class.

 
The database password is configured locally and is not included in this repository.

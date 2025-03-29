package encapsulation;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // TODO DATABASE
        Customer[] customers = new Customer[0];

        Customer customer = new Customer(1, "Elnura", "el@gmail.com", LocalDate.of(2004, 3, 3), "+996505664433");
        Customer customer1 = new Customer(2, "Sanjar", "s@gmail.com", LocalDate.of(2004, 3, 3), "+996505664433");
        Customer customer2 = new Customer(3, "Baitenir", "b@gmail.com", LocalDate.of(2004, 3, 3), "+996505664433");
        Customer customer3 = new Customer(4, "Test", "t@gmail.com", LocalDate.of(2004, 3, 3), "+996505664433");

        // TODO CREATE
        customers = Customer.createCustomer(customers, customer);
        customers = Customer.createCustomer(customers, customer1);
        customers = Customer.createCustomer(customers, customer2);
        customers = Customer.createCustomer(customers, customer3);

        // TODO READ
        // getAll
        System.out.println("All Customers: " + Arrays.toString(Customer.getAllCustomers(customers)));

        // getById
        System.out.println("Get By Id Customer: " + Customer.getById(3, customers));

        // TODO UPDATE
        Customer updateCustomer = new Customer(0, "Symbat", "n@gmail.com", LocalDate.of(2003, 4, 6), "+996789554433");

        customers = Customer.updateCustomerById(2, customers, updateCustomer);
        System.out.println("UPDATED ARRAY: " + Arrays.toString(customers));

        // TODO DELETE
        customers = Customer.deleteCustomerById(4, customers);
        System.out.println("All Customers after deletion: " + Arrays.toString(customers));
    }
}

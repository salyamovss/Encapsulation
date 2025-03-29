package encapsulation;

import java.time.LocalDate;

public class Customer {
    private long id;
    private String firstName;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;

    // Конструктор
    public Customer(long id, String firstName, String email, LocalDate dateOfBirth, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    // Getters & Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // TODO 1 - CREATE:
    public static Customer[] createCustomer(Customer[] customers, Customer customer) {
        Customer[] newCustomers = new Customer[customers.length + 1];
        System.arraycopy(customers, 0, newCustomers, 0, customers.length);
        newCustomers[customers.length] = customer;
        System.out.println("Successfully saved!");
        return newCustomers;
    }

    // TODO 2 - READ (GET ALL)
    public static Customer[] getAllCustomers(Customer[] customers) {
        return customers;
    }

    // TODO 2 - READ (GET BY ID)
    public static Customer getById(long id, Customer[] customers) {
        for (Customer customer : customers) {
            if (customer.getId() == id) return customer;
        }
        return null;
    }

    // TODO 3 - UPDATE:
    public static Customer[] updateCustomerById(long id, Customer[] customers, Customer updateCustomer) {
        Customer oldCustomer = getById(id, customers);
        if (oldCustomer == null) {
            System.out.println("Customer not found!");
            return customers;
        }

        if (updateCustomer.getFirstName() != null && !updateCustomer.getFirstName().isEmpty()) {
            oldCustomer.setFirstName(updateCustomer.getFirstName());
        }
        if (updateCustomer.getEmail() != null && !updateCustomer.getEmail().isEmpty()) {
            oldCustomer.setEmail(updateCustomer.getEmail());
        }
        if (updateCustomer.getDateOfBirth() != null) {
            oldCustomer.setDateOfBirth(updateCustomer.getDateOfBirth());
        }
        if (updateCustomer.getPhoneNumber() != null && !updateCustomer.getPhoneNumber().isEmpty()) {
            oldCustomer.setPhoneNumber(updateCustomer.getPhoneNumber());
        }
        return customers;
    }

    // TODO 4 - DELETE:
    public static Customer[] deleteCustomerById(long id, Customer[] customers) {
        int index = -1;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Customer not found!");
            return customers;
        }

        Customer[] newCustomers = new Customer[customers.length - 1];
        System.arraycopy(customers, 0, newCustomers, 0, index);
        System.arraycopy(customers, index + 1, newCustomers, index, customers.length - index - 1);
        System.out.println("Customer deleted successfully!");
        return newCustomers;
    }

    public String showAllInfoPerson() {
        return "Id: " + id +
               "\nName: " + firstName +
               "\nEmail: " + email +
               "\nDate of birth: " + dateOfBirth +
               "\nPhone number: " + phoneNumber;
    }

    public static void showAllArray(Customer[] customers) {
        System.out.println("______________________________________");
        for (Customer customer : customers) {
            System.out.println(customer.showAllInfoPerson());
            System.out.println();
        }
        System.out.println("______________________________________");
    }

    @Override
    public String toString() {
        return "Customer{" +
               "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", email='" + email + '\'' +
               ", dateOfBirth=" + dateOfBirth +
               ", phoneNumber='" + phoneNumber + '\'' +
               '}';
    }
}

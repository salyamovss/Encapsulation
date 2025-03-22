import java.time.LocalDate;

public class Car {
    String model;
    LocalDate carYear;
    int price;
    String state;

    public Car(String model, LocalDate carYear, int price, String state) {
        this.model = model;
        this.carYear = carYear;
        this.price = price;
        this.state = state;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarYear(LocalDate carYear) {
        this.carYear = carYear;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getCarYear() {
        return carYear;
    }

    public int getPrice() {
        return price;
    }

    public String getState() {
        return state;
    }
}

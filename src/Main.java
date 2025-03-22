import java.awt.font.FontRenderContext;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        University university1 = new University("AIU","BACALAVR",1700,3000);
        University university2 = new University("BGU","BACALAVR",1100,3800);
        University university3 = new University("KGMA","BACALAVR",800,5000);
        University university4 = new University("POLITEX","BACALAVR",500,4100);

        School school1 = new School("Isaac Newton", "Antalya Batken", 18,3000);
        School school2 = new School("Seytek", "Tunguch", 10,2000);
        School school3 = new School("Semetey", "Osh", 15,700);
        School school4 = new School("Manas", "Talas", 25,900);


        Car car1 = new Car("Tesla 3",LocalDate.ofYearDay(2019, 22), 2500, "perfect");
        Car car2 = new Car("Mazda",LocalDate.ofYearDay(2029, 2), 5500, "perfect");
        Car car3 = new Car("Jiguli",LocalDate.ofYearDay(2009, 12), 1000, "perfect");
        Car car4 = new Car("lixang",LocalDate.ofYearDay(2024, 27), 7500, "perfect");

        Person person1 = new Person("Symbat", "Saliamov", LocalDate.of(2006,7,24), 'M');
        Person person2 = new Person("Nurik", "Saliamov", LocalDate.of(2007,6,25), 'M');
        Person person3 = new Person("Asan", "Saliamov", LocalDate.of(2005,7,26), 'M');
        Person person4 = new Person("Uson", "Saliamov", LocalDate.of(2003,8,27), 'M');


        University[] Universities = {university1,university2,university3,university4};
        for (University university : Universities) {
            university.setUniver();
        }
        School[] schools = {school1,school2,school3, school3};
        for (School school : schools){
        }

        Car[] cars = {car1,car2,car3,car4};
        Person[] persons = {person1,person2,person3,person4};




    }
}
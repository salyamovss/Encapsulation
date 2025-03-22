public class School {
    String nameOfSchool;
    String address;
    int Classes;
    int quantityOfStudents;

    public School(String nameOfSchool, String address, int classes, int quantityOfStudents) {
        this.nameOfSchool = nameOfSchool;
        this.address = address;
        Classes = classes;
        this.quantityOfStudents = quantityOfStudents;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public String getAddress() {
        return address;
    }

    public int getClasses() {
        return Classes;
    }

    public int getQuantityOfStudents() {
        return quantityOfStudents;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setClasses(int classes) {
        Classes = classes;
    }

    public void setQuantityOfStudents(int quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }

    public void setSchool(){

    }

}

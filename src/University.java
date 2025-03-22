public class University {
    private String nameOfUniversity;
    private String academicDegree;
    private int tutionFee;
    private int quantityOfStudents;

    public University(String nameOfUniversity, String academicDegree, int tutionFee, int quantityOfStudents) {
        this.nameOfUniversity = nameOfUniversity;
        this.academicDegree = academicDegree;
        this.tutionFee = tutionFee;
        this.quantityOfStudents = quantityOfStudents;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public int getTutionFee() {
        return tutionFee;
    }

    public int getQuantityOfStudents() {
        return quantityOfStudents;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public void setTutionFee(int tutionFee) {
        this.tutionFee = tutionFee;
    }

    public void setQuantityOfStudents(int quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }

    public void setUniver(){
        if (academicDegree.equals("BACALAVR"))
            System.out.println("academic Degree : " + academicDegree);
        else {
            return;
        }
        System.out.println("name Of University : " + nameOfUniversity);

        System.out.println("tution Fee = " + tutionFee + " dolllars");
        System.out.println("quantity Of Students = " + quantityOfStudents + " students");
        System.out.println();
    }
}


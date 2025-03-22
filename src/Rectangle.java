public class Rectangle {
    private int lenght;
    private int hight;

    public Rectangle(){

    }

    public Rectangle(int lenght, int hight) {
        this.lenght = lenght;
        this.hight = hight;
    }

    public int getLenght(){
        return lenght;
    }
    public void setLenght(int lenght){
        this.lenght = lenght;
    }


    public int getHight(){
        return hight;
    }
    public void setHight(int hight){
        this.hight = hight;
    }

    public int findArea(){
        int Area = lenght * hight;
        return Area;
    }

}

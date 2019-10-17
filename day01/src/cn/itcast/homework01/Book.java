package cn.itcast.homework01;

public class Book {
    int num;
    String name;
    Double price;

    public Book(){
        System.out.println("Book类的无参构造方法启动了！");
    }

    public Book(int num,String name,Double price){
        System.out.println("Book类的有参构造方法启动了");
        this.num = num;
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

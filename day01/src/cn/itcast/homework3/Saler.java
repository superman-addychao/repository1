package cn.itcast.homework3;
/*
    项目经理(Manager):基本工资 + 项目奖金(一个项目奖金1500元)
    销售员(Sales):  基本工资 + 销售额(总销售额的0.05)
    程序员(Coder):  基本工资 + 加班奖金(一小时奖金为80元)
    另外:如果当月有员工生日 那么给员工发放500元生日金
 */
public class Saler extends Employee{
    int total_sale;

    public Saler() {
        System.out.println("Saler类的无参构造函数启动了！");
    }

    public Saler(int Salary, int birMouth, int total_sale) {
        super(Salary, birMouth);
        this.total_sale = total_sale;
    }

    @Override
    public int calcSalary() {
        return super.calcSalary()+(int)(total_sale*0.05);
    }
}

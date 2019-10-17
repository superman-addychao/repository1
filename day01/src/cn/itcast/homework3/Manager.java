package cn.itcast.homework3;

/*
    项目经理(Manager):基本工资 + 项目奖金(一个项目奖金1500元)
    销售员(Sales):  基本工资 + 销售额(总销售额的0.05)
    程序员(Coder):  基本工资 + 加班奖金(一小时奖金为80元)
    另外:如果当月有员工生日 那么给员工发放500元生日金
 */
public class Manager extends Employee {
    int project_Num;
    int total_Salary;

    public Manager() {
        System.out.println("Manager类的无参构造方法启动了！");
    }

    public Manager(int Salary, int birMouth, int project_Num) {
        super(Salary, birMouth);
        this.project_Num = project_Num;
    }

    @Override
    public int calcSalary() {
        total_Salary = super.calcSalary()+project_Num*1500;
        return total_Salary;
    }
}

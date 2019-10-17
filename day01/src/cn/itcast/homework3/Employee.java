package cn.itcast.homework3;

/*
    某公司的雇员分为以下若干类:
    雇员(Employee):
    这是所有员工总的父类,属性:员工基本工资,员工生日的月份,如果是一月份生日的员工,则增加500百元生日金

    项目经理(Manager):基本工资 + 项目奖金(一个项目奖金1500元)
    销售员(Sales):  基本工资 + 销售额(总销售额的0.05)
    程序员(Coder):  基本工资 + 加班奖金(一小时奖金为80元)
    另外:如果当月有员工生日 那么给员工发放500元生日金
 */
public abstract class Employee {
    int Salary;
    int birMouth;

    public Employee() {

    }

    Employee(int Salary, int birMouth) {
        this.Salary = Salary;
        this.birMouth = birMouth;
    }

    public int calcSalary() {
        if (birMouth == 1) {
            return Salary + 500;
        } else {
            return Salary;
        }
    }
}

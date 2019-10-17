package cn.itcast.homework3;
/*
    项目经理(Manager):基本工资 + 项目奖金(一个项目奖金1500元)
    销售员(Sales):  基本工资 + 销售额(总销售额的0.05)
    程序员(Coder):  基本工资 + 加班奖金(一小时奖金为80元)
    另外:如果当月有员工生日 那么给员工发放500元生日金
 */
public class Coder extends Employee{
    int overTime;

    public Coder(){

    }

    public Coder(int Salary,int birMouth,int overTime){
        super(Salary,birMouth);
        this.overTime = overTime;
    }

    @Override
    public int calcSalary() {
        return super.calcSalary()+overTime*80;
    }
}

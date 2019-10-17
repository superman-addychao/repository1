package cn.itcast.homework3;

public class Test {
    public static void main(String[] args) {
        Manager mg = new Manager(10000,1,3);
        int salary1 = mg.calcSalary();

        System.out.println("项目经理的该月工资是："+salary1);
        System.out.println();

        Saler saler = new Saler(5000,3,30000);
        int salary2 = saler.calcSalary();
        System.out.println("销售人员的该月工资是："+salary2);
        System.out.println();

        Coder coder = new Coder(15000,2,10);
        int salary3 = coder.calcSalary();
        System.out.println("程序员的改月工资是："+salary3);

    }
}

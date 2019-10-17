package cn.itcast.homework02;
/*
    二,有三个教师分别教授上面三个课程,请定义一个类描述以下教师信息
    注意:教师类中的科目是课程类型,不是字符串类型
    教师编号	    姓名	    性别	     年龄	 科目
    t001	   薛之谦	 男       26	 Java
    t002	   张碧晨	 女       24	 IOS
    t003	   周杰伦    男       28    MySQL
 */
public class Teacher {
    String num;
    String name;
    String sex;
    int age;
    // 类中的成员属性，数据类型既可以是基本数据类型，也可以是引用数据类型
    Subject subject;

    public Teacher(){
        System.out.println("Teacher类的无参构造方法开始启动了！");
    }

    public Teacher(String num,String name,String sex,int age,Subject subject){
        this.num = num;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.subject = subject;
        System.out.println("Teacher类的有参构造方法开始启动了！");
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void showInfo(){
        System.out.println(num+"    "+name+"    "+sex+"    "+age+"    "+subject.getName()+"    ");
    }
}

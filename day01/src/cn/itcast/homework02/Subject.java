package cn.itcast.homework02;
/*
    一,有三个课程,分别是java ios和mysql,请定义一个类描述以下课程信息
    课程编号	    名称	    创建时间		    课程描述
    s001	   Java		2007-02-08	    包含JavaSE和JavaEE
    s002	   IOS		2007-02-09	    IOS系统开发
    s003	   Mysql	2007-02-07	    强大的数据库管理

 */
public class Subject {
    String num;
    String name;
    String createTime;
    String description;

    public Subject(){
        System.out.println("课程类的无参构造方法开始启动了！");
    }

    public Subject(String num,String name,String createTime,String description){
        this.num = num;
        this.name = name;
        this.createTime = createTime;
        this.description = description;
        System.out.println("课程类的有参构造方法开始启动了！");
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

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void showDetails(){
        /*System.out.println("课程编号："+num);
        System.out.println("课程名称："+name);
        System.out.println("创建时间："+createTime);
        System.out.println("课程描述："+description);*/
        System.out.println(num+"    "+name+"    "+createTime+"    "+description+"    ");
    }
}

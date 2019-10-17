package cn.itcast.homework02;
/*
    三,定义测试类 编写测试代码完成老师信息和课程信息的打印输出到控制台
 */
public class Test {
    public static void main(String[] args) {
        Subject[] subjects = new Subject[3];
        Teacher[] teachers = new Teacher[3];

        // 如果实参是引用数据类型，传递的是地址，则形参的改变会影响实参
        initSubjects(subjects);
        showAllSubjects(subjects);

        System.out.println();
        System.out.println("----------------------------------------------");
        initTeachers(teachers,subjects);
        showAllTeachers(teachers);
    }

    // 以下方法展示全部教师信息
    public static void showAllTeachers(Teacher[] teachers) {
        System.out.println("以下是全部老师的详细信息：");
        System.out.println("教师编号"+" "+"姓名"+"    "+"性别"+"    "+"年龄"+"    "+"科目");
        for (int i = 0; i < teachers.length; i++) {
            teachers[i].showInfo();
        }
    }

    // 初始化全部教师信息
    public static void initTeachers(Teacher[] teachers, Subject[] subjects) {
        teachers[0] = new Teacher("t001","薛之谦","男",26,subjects[0]);
        teachers[1] = new Teacher("t002","张碧晨","女",24,subjects[1]);
        teachers[2] = new Teacher("t003","周杰伦","男",28,subjects[2]);
        System.out.println();
    }


    // 以下方法用来展示每一个课程的详细信息
    public static void showAllSubjects(Subject[] subjects) {
        System.out.println("以下是全部课程的详细信息：");
        // 课程编号	    名称	    创建时间		    课程描述
        System.out.println("课程编号"+"     "+"名称"+"    "+"创建时间"+"  "+"课程描述");
        for (int i = 0; i < subjects.length; i++) {
            subjects[i].showDetails();
        }
    }

    // 调用课程的有参构造方法，初始化每一个课程的信息
    public static void initSubjects(Subject[] subjects) {
        subjects[0] = new Subject("s001","Java","2007-02-08","包含JavaSE和JavaEE");
        subjects[1] = new Subject("s002","IOS","2007-02-09","IOS系统开发");
        subjects[2] = new Subject("s003","Mysql","2007-02-07","强大的数据库管理");
        System.out.println();
    }

}

package baseapi.Day04;
/*
如果一个成员变量使用了static 关键字，那么这个变量不止属于对象自己 而是属于所在的类，多个对象共享同一份数据

 */
public class Demo01StatticFields {
    public static void main(String[] args) {
        Student tester1 = new Student("tester1", 10);
        Student tester2 = new Student("tester2", 35);
        tester1.grade="桃花岛";
        System.out.println("姓名："+tester1.getName()+",年龄："+tester1.getAge()+"，所在地："+tester1.grade);
    }
}




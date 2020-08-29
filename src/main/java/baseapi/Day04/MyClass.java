package baseapi.Day04;

public class MyClass {
    int num;
    static int numStatic;
    public  void method(){
        System.out.println("这是一个成员方法");
        System.out.println(num);
        System.out.println(numStatic);
    }
    public static void staticmethod(){
        System.out.println("这是一个静态方法");
        System.out.println(numStatic);
//        System.out.println(num);//静态方法无法访问 非静态成员变量

    }
}

package baseapi.Day04;
/*
一旦使用了static修饰成员方法 那么这就成为了静态方法，静态方法不属于对象类
如果没有static关键字 那么必须首先创建对象,然后通多对象才能使用它
如果有了static关键字  那么不需要创建对象 直接就能通过类名称使用它
无论是成员变量 还是成员方法  如果有了static  都推荐使用类名称进行调用
静态变量：类名称.静态变量
静态方法：类名称.静态方法()
对于本类当中的静态方法，可以直接省略类名称
总结：静态不止直接访问非静态
 */
public class Demo02StaticClass {
    public static void main(String[] args) {
        MyClass me = new MyClass();  //首先创建对象
        me.method();  //然后才能使用没有static 关键字的内容
        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称调用
        me.staticmethod();//可以使用但是不推荐
        MyClass.staticmethod();//正确的使用方法

    }
}

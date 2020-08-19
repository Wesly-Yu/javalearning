package baseapi.Day03;


import java.util.ArrayList;

/*
public boolean add(E e):向集合中添加元素,参数类型和泛型一致
public E get(int index):从集合中获取元素，参数是索引编号
public E remove(int index):从集合中删除元素，参数是索引编号，返回值是被删除的元素
public int size()  :返回集合中包含的元素个数
arraylist  一定会添加成功  别的集合不一定
 */
public class Demo01Arraylist {
    public static void main(String[] args) {
        ArrayList<String>  arrayList = new ArrayList<String>();
        boolean list = arrayList.add("teststr");
        arrayList.add("tester");
        arrayList.add("home");
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.size());
    }
}

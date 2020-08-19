package baseapi.Day03;

import java.util.ArrayList;
import java.util.Random;

public class Demo03ArraylistRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i <6 ; i++) {
            int num = random.nextInt(32)+1;
            list1.add(num);
        }
        for (int j = 0; j <list1.size() ; j++) {
            System.out.println(list1.get(j));
        }
    }
}

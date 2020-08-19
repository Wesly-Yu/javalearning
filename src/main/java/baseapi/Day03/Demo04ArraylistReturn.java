package baseapi.Day03;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArraylistReturn {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int ran = random.nextInt(100);
            biglist.add(ran);
        }
        ArrayList<Integer> smallList = getSmallList(biglist);
        for (int j = 0; j < smallList.size(); j++) {
            System.out.println(smallList.get(j));

        }
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> biglist) {
        ArrayList<Integer> SmallList = new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
            int num = biglist.get(i);
            if (num % 2 == 0) {
                SmallList.add(num);
            }

        }
        return SmallList;
    }

}

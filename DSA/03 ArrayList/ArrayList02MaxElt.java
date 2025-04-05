import java.util.ArrayList;
public class ArrayList02MaxElt {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        int max = Integer.MIN_VALUE;       // setting max as negative infinity
        for (int i = 0; i < list1.size(); i++) {
            // if (max < list1.get(i)) {
            //     max = list1.get(i);
            // }
            max = Math.max(max, list1.get(i));
        }
        System.out.println(max);
    }
}

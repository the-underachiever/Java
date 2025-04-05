import java.util.ArrayList;
import java.util.Collections;
public class ArrayList04Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(55);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

        Collections.sort(list1);    //sorts in ascending order
        System.out.println(list1); 
        //for descending order sorting :
        Collections.sort(list1,Collections.reverseOrder());
        // Collections.reverseOrder() is a comparator (fnx)
        System.out.println(list1);

    }
}

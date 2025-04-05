import java.util.ArrayList;

public class ArrayList01_Basics {
    public static void main(String[] args) {
        //Classname ObjectName = new ClassName();
        ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Float> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        //Adding elements in list1      Time : O(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1+"\n");

        //Get operation     Time : O(1)
        int a = list1.get(2);
        System.out.println("At index 2 element = "+a);

        //Remove from ArrayList
        list1.remove(2);
        System.out.println("\nAfter removing index 2 elt list 1 = "+list1);

        //Set Elt at index      Time : O(n)
        list1.set(2, 77);   //NOTE : it removes elt at given index then add specified value
        System.out.println("\n List after adding elt at index 2 = "+list1);

        //Check if list contains given elt in it
        System.out.println("\n Checking if list contains elt 4 & result is : "+list1.contains(4));
        System.out.println("doing same for value 2 & result = "+list1.contains(2));
        
        //Size of ArrayList
        System.out.println("\n Size of ArrayList list1 : "+list1.size()+"\n");

        //Printing ArrayList
        //System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i)+ " ");
        }
    }    
}